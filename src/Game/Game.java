package Game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class Game extends Application {

    private Stage primaryStage;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage){
        try {
            createGame(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.primaryStage.show();
    }

    public void createGame(Stage primaryStage) throws Exception{
        URL url = new File("src/Game/res/combatScene.fxml").toURL();
        GridPane game = FXMLLoader.load(url);
        primaryStage.setTitle("World");
        primaryStage.setScene(new Scene(game, 1200, 900));
        this.primaryStage = primaryStage;
    }

    public Stage getGame() {
        return primaryStage;
    }
}
