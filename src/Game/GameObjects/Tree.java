package Game.GameObjects;

import Game.Entíties.Entity;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Tree extends Entity {

    Tree(int posX, int posY, int width, int height, Image objectImage, GridPane root) {
        super(posX, posY, width, height, objectImage, root);
    }
}
