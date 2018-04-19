package Game.Entíties;

import Game.GameObjects.GameObject;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public abstract class Entity extends GameObject {
    private int originObjectWidth;
    private int originObjectHeight;
    private Image objectImage;

    public Entity(int posX, int posY, int width, int height, Image objectImage, GridPane root) {
        super(posX, posY, width, height, root);
        this.objectImage = objectImage;
    }

    public void renderEntity(int originWidth, int originHeight){
        super.renderObject(originWidth, originHeight, objectImage);
        this.originObjectHeight = originHeight;
        this.originObjectWidth = originWidth;
    }
    public int getOriginObjectWidth(){
        return originObjectWidth;
    }
    public int getOriginObjectHeight(){
        return originObjectHeight;
    }
}
