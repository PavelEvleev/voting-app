package by.pavel.votingapp.service;

import by.pavel.votingapp.model.ThemeAnswer;
import by.pavel.votingapp.model.ThemeVote;
import by.pavel.votingapp.model.Voter;
import by.pavel.votingapp.repository.ThemeAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pavel on 22.09.18.
 */
@Service
public class ThemeAnswerService {

    private ThemeAnswerRepository repository;

    @Autowired
    public ThemeAnswerService(ThemeAnswerRepository repository) {
        this.repository = repository;
    }

    public ThemeAnswer voting(ThemeVote vote, boolean answer, Voter voter) {
        return this.repository.saveAndFlush(new ThemeAnswer(vote, answer, voter));
    }

    public List<ThemeAnswer> getVoteAnswers(Long voteId){
        return this.repository.findThemeAnswerByThemeVote_Id(voteId);
    }

    public List<ThemeAnswer> findAll() {
        return this.repository.findAll();
    }

    public ThemeAnswer getOne(Long id) {
        return this.repository.getOne(id);
    }

    public ThemeAnswer updateOne(ThemeAnswer optionVote) {
        return this.repository.saveAndFlush(optionVote);
    }

}
