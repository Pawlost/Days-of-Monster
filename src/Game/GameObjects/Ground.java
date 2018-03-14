package Game.GameObjects;

import Game.GameObject;
import monsterengine.GameVariables;
import monsterengine.menu.TestMap;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ground extends GameObject {
    private static Image groundImage;

    public Ground(int posX, int posY) {
        super(posX, posY, groundImage);
    }
    private static void ctreateImage(){
        try {
            groundImage = ImageIO.read(GameVariables.ground);
        } catch (IOException ex) {
            Logger.getLogger(TestMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
