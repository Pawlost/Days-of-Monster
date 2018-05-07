package Engine;

import Game.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

public class MonsterEngine extends Application {

    public static void main(String[] args)  {
        Game.createGame();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL url = new File("res/Engine/res/Layouts/editor.fxml").toURL();
        Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("Hello Editor");
        primaryStage.setScene(new Scene(root, 300, 600));
        primaryStage.show();
    }

}
