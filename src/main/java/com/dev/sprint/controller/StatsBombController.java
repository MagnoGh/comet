package com.dev.sprint.controller;

import com.dev.sprint.model.Game;
import com.dev.sprint.model.Player;
import com.dev.sprint.service.StatsBombMemoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stats")
public class StatsBombController {
    private final StatsBombMemoryService service;


    public StatsBombController(StatsBombMemoryService service) {
        this.service = service;
    }

    @GetMapping("/games/top5")
    public List<Game> getTop5Games() {
        return service.getTop5Games();
    }

    @GetMapping("/players/top5")
    public List<Player> getTop5Players() {
        return service.getTop5Players();
    }
}
