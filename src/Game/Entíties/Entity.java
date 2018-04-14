package Game.Entíties;

import Game.GameObjects.GameObject;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public abstract class Entity extends GameObject {
    private Pane object;

    Entity(int posX, int posY, int width, int height, Image objectImage) {
        super(posX, posY, width, height, objectImage);
        object = new Pane();
    }

    public void renderEntity(GridPane gridPane){
        super.centerRenderObject(gridPane, object);
    }
}
