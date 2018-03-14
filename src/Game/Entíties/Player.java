
package Game.Entíties;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import Game.GameObject;
import monsterengine.GameVariables;
import monsterengine.menu.TestMap;
public class Player extends GameObject {
    private static Image playerImage;

    public Player(int posX, int posY)
    {
        super(posX, posY, playerImage);
    }
    private static void ctreateImage() {
        try {
            playerImage = ImageIO.read(GameVariables.player);
        } catch (IOException ex) {
            Logger.getLogger(TestMap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}