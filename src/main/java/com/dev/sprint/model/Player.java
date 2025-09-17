package com.dev.sprint.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private int id;
    private String name;
    private String team;
    private int points;
    private int position;
    private String change;

    public Player() {}

    public Player(int id, String name, String team, int points, int position, String change) {
        this.id = id; this.name = name; this.team = team;
        this.points = points; this.position = position; this.change = change;
    }
}
