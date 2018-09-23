package by.pavel.votingapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "theme_answer")
public class ThemeAnswer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "theme_id", nullable = false)
    private ThemeVote themeVote;

    @Column(name = "answer")
    private Boolean answer;

    @ManyToOne
    @JoinColumn(name = "voter_id")
    private Voter voter;

    public ThemeAnswer() {
    }

    public ThemeAnswer(ThemeVote themeVote, Boolean answer, Voter voter) {
        this.themeVote = themeVote;
        this.answer = answer;
        this.voter = voter;
    }

    public Long getId() {
        return id;
    }

    public ThemeVote getThemeVote() {
        return themeVote;
    }

    public void setThemeVote(ThemeVote themeVote) {
        this.themeVote = themeVote;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }

    public Voter getVoter() {
        return voter;
    }

    public void setVoter(Voter voter) {
        this.voter = voter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThemeAnswer answer1 = (ThemeAnswer) o;

        if (id != null ? !id.equals(answer1.id) : answer1.id != null) return false;
        if (answer != null ? !answer.equals(answer1.answer) : answer1.answer != null) return false;
        return voter != null ? voter.equals(answer1.voter) : answer1.voter == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (voter != null ? voter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ThemeAnswer{" +
                "id=" + id +
                ", answer=" + answer +
                '}';
    }
}
