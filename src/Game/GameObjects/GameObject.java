package Game.GameObjects;

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
    private Pane object;
    private GridPane root;

    protected GameObject(int posX, int posY, int width, int height, GridPane root) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;

        this.root = root;

        object = new Pane();
    }

    public void renderObject(Image image){
        Rectangle rec = new Rectangle(width,height);
        rec.setFill(new ImagePattern(image, 0, 0, 1, 1, true));
        object.getChildren().add(rec);
        root.add(rec, posX, posY);
    }

    public void renderObject(int originWidth, int originHeight, Image image){
        Rectangle rec = new Rectangle((originWidth-width)/2,(originHeight-width)/2 , width, height);
        rec.setFill(new ImagePattern(image, 0, 0, 1, 1, true));
        object.getChildren().add(rec);

        if(root.getChildren().contains(object)){
            root.getChildren().removeAll(object);
        }

        root.add(object, posX, posY);
    }

    public void addObject(Pane newObject){

        if(object.getChildren().contains(newObject)){
            object.getChildren().removeAll(newObject);
        } else{
            object.getChildren().add(newObject);
        }

        if(root.getChildren().contains(object)){
            root.getChildren().removeAll(object);
        }

        root.add(object, posX, posY);
    }

    void removeAll(Pane removeObject){
        if(object.getChildren().contains(removeObject)) {
            object.getChildren().removeAll(removeObject);
        }

        if(root.getChildren().contains(object)){
            root.getChildren().removeAll(object);
        }

        root.add(object, posX, posY);
    }

    public void setPosition(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }

    public Pane getObject(){
        return object;
    }
}
