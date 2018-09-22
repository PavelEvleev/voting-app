package by.pavel.votingapp.controller.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

/**
 * Created by pavel on 22.09.18.
 */
public class CreateThemeVoteCommand {

    @JsonIgnore
    private String uuid;

    private boolean active;

    private String title;

    public CreateThemeVoteCommand() {
        this.uuid = UUID.randomUUID().toString();
    }

    public CreateThemeVoteCommand(boolean active, String title) {
        this.active = active;
        this.title = title;
        this.uuid = UUID.randomUUID().toString();
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
}

