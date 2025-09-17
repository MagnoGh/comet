package com.dev.sprint.model;

public class Game {
    private String time;
    private int points;

    public Game(){};

    public Game(String time, int points) {
        this.time = time;
        this.points = points;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        time = time;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
