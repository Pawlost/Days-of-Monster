package Game.Scenes;

import Game.CombatMap;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GameScene implements Initializable {
    @FXML
    private GridPane map;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<CombatMap> combatMaps = new ArrayList<>();
        new CombatMap("CombatMap 1", map);
    }
}
