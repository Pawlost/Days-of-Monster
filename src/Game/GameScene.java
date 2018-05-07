package Game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GameScene implements Initializable {
    @FXML
    private GridPane map;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<MapScene> mapScenes = new ArrayList<>();
        new MapScene("MapScene 1", map);
    }
}
