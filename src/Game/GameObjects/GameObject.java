package Game.GameObjects;

import Game.Map;
import javafx.scene.Group;
import javafx.scene.image.Image;

import java.awt.*;
import java.util.ArrayList;

public abstract class GameObject {
    private ArrayList<Image> objectImages = new ArrayList<Image>();
    private GridBagConstraints gc = new GridBagConstraints();

    protected GameObject(int posX, int posY, int scaleX, int scaleY) {

        gc.fill = GridBagConstraints.BOTH;
        gc.gridx = posX;
        gc.gridy = posY;

        gc.ipady = scaleX;
        gc.ipadx = scaleY;
    }

    protected void paintComponent(Group g) {
    }

    void addDrawingImage(Image other) {
        objectImages.add(other);
    }

    public Image getImage(){
        return objectImages.get(0);
    }
}
