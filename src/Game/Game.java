package Game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

public class Game extends Application {
    private Stage primaryStage;

    public static void main(String[] args) {
        createGame();
    }

    public static void createGame() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        startStage();
        this.primaryStage = primaryStage;
        URL url = new File("src/Game/res/combatScene.fxml").toURL();
        Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("World");

        primaryStage.setScene(new Scene(root, 1200, 900));
        primaryStage.show();
    }

    private void startStage() {
        primaryStage.show();
    }
}
