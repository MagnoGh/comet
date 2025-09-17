package com.dev.sprint.service;

import com.dev.sprint.model.Game;
import com.dev.sprint.model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class StatsBombMemoryService {

    public List<Game> games;
    public List<Player> players;

    public StatsBombMemoryService() {
        initData();
    }

    public void initData() {

        games = new ArrayList<>();
        games.add(new Game(1, "Corinthians Feminino", 2850, 1, "+2"));
        games.add(new Game(2, "Palmeiras Feminino", 2780, 2, "-1"));
        games.add(new Game(3, "São Paulo Feminino", 2720, 3, "+1"));
        games.add(new Game(4, "Santos Feminino", 2680, 4, "-2"));
        games.add(new Game(5, "Flamengo Feminino", 2650, 5, "0"));

        games.sort(Comparator.comparingInt(Game::getPoints).reversed());

        players = new ArrayList<>();
        players.add(new Player(1, "Marta", "Orlando Pride", 95, 1, "+1"));
        players.add(new Player(2, "Debinha", "Kansas City Current", 92, 2, "-1"));
        players.add(new Player(3, "Adriana", "Orlando Pride", 89, 3, "+2"));
        players.add(new Player(4, "Kerolin", "North Carolina Courage", 87, 4, "0"));
        players.add(new Player(5, "Bia Zaneratto", "Palmeiras", 85, 5, "-2"));

        players.sort(Comparator.comparingInt(Player::getPoints).reversed());
    }

    public List<Game> getTop5Games() {
        return games;
    }

    public List<Player> getTop5Players() {
        return players;
    }
}
