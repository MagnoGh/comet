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
        games.add(new Game("Corinthians Feminino", 2850));
        games.add(new Game("Palmeiras Feminino", 2780));
        games.add(new Game("São Paulo Feminino", 2720));
        games.add(new Game("Santos Feminino", 2680));
        games.add(new Game("Flamengo Feminino", 2650));

        games.sort(Comparator.comparingInt(Game::getPoints).reversed());

        players = new ArrayList<>();
        players.add(new Player("Marta", "Orlando Pride", 95));
        players.add(new Player("Debinha", "Kansas City Current", 92));
        players.add(new Player("Adriana", "Orlando Pride", 89));
        players.add(new Player("Kerolin", "North Carolina Courage", 87));
        players.add(new Player("Bia Zaneratto", "Palmeiras", 85));

        players.sort(Comparator.comparingInt(Player::getPoints).reversed());
    }

    public List<Game> getTop5Games() {
        return games;
    }

    public List<Player> getTop5Players() {
        return players;
    }
}
