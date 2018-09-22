package by.pavel.votingapp.service;

import by.pavel.votingapp.controller.model.ActiveVoteCommand;
import by.pavel.votingapp.controller.model.CreateThemeVoteCommand;
import by.pavel.votingapp.model.ThemeVote;
import by.pavel.votingapp.repository.ThemeVoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pavel on 22.09.18.
 */
@Service
public class ThemeVoteService {

    private ThemeVoteRepository repository;

    @Autowired
    public ThemeVoteService(ThemeVoteRepository repository) {
        this.repository = repository;
    }

    public ThemeVote create(CreateThemeVoteCommand command) {
        return this.repository.saveAndFlush(new ThemeVote(command.getUuid(), command.isActive(), command.getTitle()));
    }

    public List<ThemeVote> findAll() {
        return this.repository.findAll();
    }

    public ThemeVote activeVote(ActiveVoteCommand voteCommand) {
        ThemeVote themeVote = this.repository.getOne(voteCommand.getVoteId());
        themeVote.setActive(voteCommand.isActive());
        return this.repository.saveAndFlush(themeVote);
    }

    public ThemeVote getOne(long voteId) {
        return this.repository.getOne(voteId);
    }

    public void update(ThemeVote vote) {
        this.repository.saveAndFlush(vote);
    }

    public ThemeVote getByUUID(String uuid) {
        return this.repository.getByUuid(uuid);
    }
}
