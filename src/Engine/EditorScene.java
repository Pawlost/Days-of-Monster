package Engine;

import Game.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Editor implements Initializable {

    @FXML
    private Pane gameWindow;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Game basicGame = new Game();
        try {
            basicGame.createGame();
        } catch (Exception e) {
            e.printStackTrace();
        }

        GridPane game = basicGame.getGame();
        gameWindow.getChildren().add(game);

    }
}
