package Game;

import Game.Entíties.Player;
import Engine.GameVariables;
import Game.GameObjects.Ground;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Map {
    private Ground[][] map = new Ground[GameVariables.mapSize][GameVariables.mapSize];
    private String name;

    public Map(String name){
        this.name = name;
        CreateEntities();
    }

    public void CreateMap(GridPane root){
        for (int posY = 0; posY < GameVariables.mapSize; posY++) {
            for(int posX=0; posX < GameVariables.mapSize; posX++) {

                Image objectImage = new Image("file:src/Engine/res/Textures/GameObjects/Ground.png");

                Rectangle rec = new Rectangle(50,50);
                rec.setFill(new ImagePattern(objectImage, 0, 0, 1, 1, true));

                root.add(rec, posX, posY);
                map[posY][posX] = new Ground(posX, posY);

            }
        }
    }

    private void CreateEntities(){
    }
}
