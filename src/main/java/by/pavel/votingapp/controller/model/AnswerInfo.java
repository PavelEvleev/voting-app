package by.pavel.votingapp.controller.model;

public class AnswerInfo {

    private Boolean answer;

    private long count;

    public AnswerInfo() {
    }

    public AnswerInfo(Boolean answer, long count) {
        this.answer = answer;
        this.count = count;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
