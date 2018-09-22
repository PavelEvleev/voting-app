package by.pavel.votingapp.controller.model;

/**
 * Created by pavel on 22.09.18.
 */
public class VotingCommand {

    private String uuid;

    private CreateVoterCommand voter;

    private boolean answer;

    public VotingCommand() {
    }

    public VotingCommand(String voteId, CreateVoterCommand voter, boolean answer) {
        this.uuid = uuid;
        this.voter = voter;
        this.answer = answer;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public CreateVoterCommand getVoter() {
        return voter;
    }

    public void setVoter(CreateVoterCommand voter) {
        this.voter = voter;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
