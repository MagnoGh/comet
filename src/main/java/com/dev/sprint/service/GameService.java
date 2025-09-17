import com.dev.sprint.model.GameModel;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class GameService {

    private final ObjectMapper mapper = new ObjectMapper();

    public List<GameModel> getTop5Games() throws IOException {
        // Exemplo: Copa do Mundo Feminina 2019
        URL url = new URL("https://raw.githubusercontent.com/statsbomb/open-data/master/data/matches/72/30.json");
        List<Map<String, Object>> matches = mapper.readValue(url, new TypeReference<List<Map<String, Object>>>() {});

        List<GameModel> games = new ArrayList<>();

        for (Map<String, Object> m : matches) {
            Map<String, Object> home = (Map<String, Object>) m.get("home_team");
            Map<String, Object> away = (Map<String, Object>) m.get("away_team");

            GameModel g = new GameModel(
                    (String) home.get("home_team_name"),
                    (String) away.get("away_team_name")
            );
            games.add(g);
        }

        // Retornar apenas os 5 primeiros
        return games.subList(0, Math.min(5, games.size()));
    }
}