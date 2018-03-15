package Game;

import monsterengine.GameVariables;
import monsterengine.menu.TestMap;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameObject extends JPanel {
    private Image objectImage;
    private int posX;
    private int posY;

    protected GameObject(File image) {
        super.setMinimumSize(new Dimension(50, 50));
        try {
            objectImage = ImageIO.read(image);
        } catch (IOException ex) {
            Logger.getLogger(TestMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(50, 50);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(objectImage, 0, 0, 50, 50, null);
    }
}
