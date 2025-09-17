package com.dev.sprint.model;

public class GameModel {
    private String Time;
    public GameModel(){};
    public GameModel (String Time) {
        this.Time = Time;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
