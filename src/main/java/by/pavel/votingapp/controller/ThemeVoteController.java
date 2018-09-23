package by.pavel.votingapp.controller;

import by.pavel.votingapp.controller.model.ActiveVoteCommand;
import by.pavel.votingapp.controller.model.CreateThemeVoteCommand;
import by.pavel.votingapp.controller.model.VoteInfo;
import by.pavel.votingapp.controller.model.VotingCommand;
import by.pavel.votingapp.model.ThemeAnswer;
import by.pavel.votingapp.model.ThemeVote;
import by.pavel.votingapp.model.Voter;
import by.pavel.votingapp.service.ThemeAnswerService;
import by.pavel.votingapp.service.ThemeVoteService;
import by.pavel.votingapp.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ThemeVoteController {

    private ThemeVoteService voteService;
    private ThemeAnswerService answerService;
    private VoterService voterService;

    @Autowired
    public ThemeVoteController(ThemeVoteService voteService, ThemeAnswerService answerService,
                               VoterService voterService) {
        this.voteService = voteService;
        this.answerService = answerService;
        this.voterService = voterService;
    }

    @PostMapping("/theme-vote")
    public ResponseEntity<ThemeVote> create(@RequestBody CreateThemeVoteCommand command) {
        ThemeVote themeVote = this.voteService.create(command);
        return ResponseEntity.status(HttpStatus.CREATED).body(themeVote);
    }

    @PostMapping("/theme-vote/active")
    public ResponseEntity<ThemeVote> active(@RequestBody ActiveVoteCommand voteCommand) {
        return ResponseEntity.ok(this.voteService.activeVote(voteCommand));
    }

    @PostMapping("/theme-vote/voting")
    public ResponseEntity voting(@RequestBody VotingCommand votingCommand) {
        if (this.voteService.voteIsActive(votingCommand.getUuid())) {
            Voter voter = this.voterService.createVoter(votingCommand.getVoter());
            ThemeVote vote = this.voteService.getByUUID(votingCommand.getUuid());
            ThemeAnswer answer = this.answerService.voting(vote, votingCommand.isAnswer(), voter);
            vote.addAnswer(answer);
            this.voteService.update(vote);
            return answer != null ? ResponseEntity.ok().build()
                    : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Voting is closed");
    }

    @GetMapping("/theme-vote/{voteId}/answers")
    public ResponseEntity<VoteInfo> findAllVoteAnswers(@PathVariable long voteId) {
        VoteInfo info =
                new VoteInfo(
                        voteId,
                        this.voteService.getVoteQuestion(voteId),
                        this.answerService.getVoteAnswersInfo(voteId));
        return ResponseEntity.ok(info);
    }

    @GetMapping("/themes-vote/active")
    public ResponseEntity<List<ThemeVote>> findAllActive() {
        return ResponseEntity.ok(this.voteService.findAllActive());
    }


}
