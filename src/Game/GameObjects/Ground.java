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

    public Ground() {
        super(GameVariables.ground);
    }
}
