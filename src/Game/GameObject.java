package Game;

import monsterengine.GameVariables;
import Game.menu.TestMap;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameObject extends JPanel {
    private ArrayList<Image> objectImages = new ArrayList<Image>();
    GridBagConstraints gc = new GridBagConstraints();

    protected GameObject(int posX, int posY, File image) {

        gc.fill = GridBagConstraints.BOTH;
        gc.gridx = posX;
        gc.gridy = posY;

        gc.ipady = GameVariables.gameObjectSize;
        gc.ipadx = GameVariables.gameObjectSize;

        super.setMinimumSize(new Dimension(50, 50));
        try {
            Image objectImage = ImageIO.read(image);
            objectImages.add(objectImage);
        } catch (IOException ex) {
            Logger.getLogger(TestMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addOnMap(JFrame jf) {
        jf.add(this, gc);
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(50, 50);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Image objectImage : objectImages) {
            g.drawImage(objectImage, 0, 0, 50, 50, null);
        }
    }

    public void addDrawingImage(Image other) {
        objectImages.add(other);
    }
    public Image getImage(){
        return objectImages.get(0);
    }
}
