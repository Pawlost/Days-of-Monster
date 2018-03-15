
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
        super( GameVariables.player);
    }
}