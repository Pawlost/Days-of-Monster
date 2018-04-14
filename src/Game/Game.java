package Game;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

public class Game extends Application  {

        public static void main(String[] args)  {
            createGame();
        }

        public static void createGame(){
            launch();
        }

        @Override
        public void start(Stage primaryStage) throws Exception{
            GridPane root1 = new GridPane();

            root1.setAlignment(Pos.CENTER);

            ArrayList<Map> maps = new ArrayList<>();
            maps.add(new Map("Map 1", root1));

            primaryStage.setTitle("World");
            primaryStage.setScene(new Scene(root1, 1200, 900));
            primaryStage.show();
        }

}
