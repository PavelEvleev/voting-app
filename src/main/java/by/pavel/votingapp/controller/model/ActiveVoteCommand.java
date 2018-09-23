package by.pavel.votingapp.controller.model;

public class ActiveVoteCommand {


    private long voteId;

    private boolean active;

    public ActiveVoteCommand() {
    }

    public ActiveVoteCommand(long voteId, boolean active) {
        this.voteId = voteId;
        this.active = active;
    }

    public long getVoteId() {
        return voteId;
    }

    public void setVoteId(long voteId) {
        this.voteId = voteId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
