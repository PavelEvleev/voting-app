package by.pavel.votingapp.controller.model;

import by.pavel.votingapp.model.ThemeAnswer;

import java.util.List;

/**
 * Created by pavel on 22.09.18.
 */
public class VoteInfo {

    private long voteId;

    private List<ThemeAnswer> answers;

    public VoteInfo(long voteId, List<ThemeAnswer> answers) {
        this.voteId = voteId;
        this.answers = answers;
    }

    public long getVoteId() {
        return voteId;
    }

    public void setVoteId(long voteId) {
        this.voteId = voteId;
    }

    public List<ThemeAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<ThemeAnswer> answers) {
        this.answers = answers;
    }
}
