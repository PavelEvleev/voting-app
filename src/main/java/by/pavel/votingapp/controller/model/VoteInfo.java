package by.pavel.votingapp.controller.model;

import java.util.List;

public class VoteInfo {

    private long voteId;

    private String question;

    private List<AnswerInfo> answers;

    public VoteInfo(long voteId, String question, List<AnswerInfo> answers) {
        this.voteId = voteId;
        this.question = question;
        this.answers = answers;
    }

    public long getVoteId() {
        return voteId;
    }

    public void setVoteId(long voteId) {
        this.voteId = voteId;
    }

    public List<AnswerInfo> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerInfo> answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
