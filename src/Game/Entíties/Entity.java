package Game.Entíties;

import Game.GameObjects.GameObject;
import Game.GameObjects.Ground;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Entity extends GameObject {
    private int originObjectWidth;
    private int originObjectHeight;
    protected Ground[][] map;
    private Image objectImage;

    public Entity(int posX, int posY, int width, int height, Image objectImage, GridPane root, Ground[][] map) {
        super(posX, posY, width, height, root);
        this.map = map;
        this.objectImage = objectImage;
        spawn();
    }

    void spawn(){
        map[posY][posX].closeGround(true);
        renderEntity(map[posY][posX].getWidth(), map[posY][posX].getHeight());
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
