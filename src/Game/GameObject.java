package Game;

import monsterengine.GameVariables;

import javax.swing.*;
import java.awt.*;

public class GameObject extends JPanel{
    private Image objectImage;
    private int posX;
    private int posY;

    protected GameObject(int posX, int posY, Image image){
        this.posX = posX;
        this.posY = posY;

        objectImage = image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(objectImage, posX, posY, posX + GameVariables.gameObjectSize, posX + GameVariables.gameObjectSize, null);
        g.dispose();
    }
}
