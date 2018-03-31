package Game.GameObjects;

import Game.Entíties.Player;
import Game.GameObject;
import monsterengine.GameVariables;

import java.awt.*;

public class Ground extends GameObject {
    private static Image groundImage;
    private int size = GameVariables.gameObjectSize;

    public Ground(int posX, int posY) {
        super(posX, posY, GameVariables.ground);
    }
    public void addPlayer(Player player){
        super.addDrawingImage(player.getImage());
        super.repaint();
    }
}
