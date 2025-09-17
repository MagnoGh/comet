package com.dev.sprint.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
    private int id;
    private String name;
    private int points;
    private int position;
    private String change;

    public Game(){};

    public Game(int id, String name, int points, int position, String change) {
        this.id = id; this.name = name; this.points = points;
        this.position = position; this.change = change;
    }

}
