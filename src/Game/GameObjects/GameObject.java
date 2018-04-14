package Game.GameObjects;

import Engine.GameVariables;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public abstract class GameObject {

    private int posX;
    private int posY;
    private int width;
    private int height;
    private Image objectImage;

    protected GameObject(int posX, int posY, int width, int height, Image objectImage) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;

        this.objectImage = objectImage;
    }

    public void renderObject(GridPane root){
        Rectangle rec = new Rectangle(width,height);
        rec.setFill(new ImagePattern(objectImage, 0, 0, 1, 1, true));
        root.add(rec, posX, posY);
    }

    public void centerRenderObject(GridPane root, Pane pane){
        Rectangle rec = new Rectangle((GameVariables.gameObjectSize-width)/2,(GameVariables.gameObjectSize-width)/2 ,width, height);
        rec.setFill(new ImagePattern(objectImage, 0, 0, 1, 1, true));
        pane.getChildren().add(rec);
        root.add(pane, posX, posY);
    }

}
