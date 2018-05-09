package Engine;

import Game.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;
import java.net.URL;

public class MonsterEngine extends Application {

    public static void main(String[] args)  {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL url = new File("src/Engine/Layouts/editor.fxml").toURL();
        Parent root = FXMLLoader.load(url);
        primaryStage.setTitle("Monster Engine");
        primaryStage.setScene(new Scene(root, EditorVariables.WINDOWWIDTH, EditorVariables.WINDOWHEIGHT));

        Game basicGame = new Game();
        Stage basicRoot = new Stage();
        try {
            basicGame.createGame(basicRoot);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ApplicationLauncher game = new ApplicationLauncher(basicGame.getGame(), primaryStage);
        primaryStage.show();
    }
}
