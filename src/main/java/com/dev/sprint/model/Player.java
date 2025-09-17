package com.dev.sprint.model;

public class Player {
    private String name;
    private String team;
    private int points;

    public Player() {}

    public Player(String name,  String team, int points) {
        this.name = name;
        this.team = team;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
