package Game.GameObjects;

import Game.Entíties.Player;
import Engine.GameVariables;

import java.awt.*;

public class Ground extends GameObject {
    private static Image groundImage;
    private int size = GameVariables.gameObjectSize;

    public Ground(int posX, int posY) {
        super(posX, posY, GameVariables.gameObjectSize, GameVariables.gameObjectSize);
    }
    public void addPlayer(Player player){
        super.addDrawingImage(player.getImage());
    }
}
