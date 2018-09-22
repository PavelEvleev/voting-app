package by.pavel.votingapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by pavel on 20.09.18.
 */
@Entity
@Table(name = "theme")
public class ThemeVote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "active")
    private boolean active;

    @NotNull
    @Column(name = "title")
    private String title;

    @JsonIgnore
    @OneToMany(mappedBy = "themeVote")
    private List<ThemeAnswer> answers;

    public ThemeVote() {
    }

    public ThemeVote(String uuid, boolean active, String title) {
        this.uuid = uuid;
        this.active = active;
        this.title = title;
    }

    public Long getId() {
        return id;
    }


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ThemeAnswer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<ThemeAnswer> answers) {
        this.answers = answers;
    }

    public void addAnswer(ThemeAnswer answer){
        this.answers.add(answer);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ThemeVote themeVote = (ThemeVote) o;

        if (active != themeVote.active) return false;
        if (id != null ? !id.equals(themeVote.id) : themeVote.id != null) return false;
        if (uuid != null ? !uuid.equals(themeVote.uuid) : themeVote.uuid != null) return false;
        return title != null ? title.equals(themeVote.title) : themeVote.title == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
