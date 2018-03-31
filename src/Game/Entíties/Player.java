
package Game.Entíties;

import Game.GameObject;
import monsterengine.GameVariables;

public class Player extends GameObject {

    public Player(int posX, int posY) {
        super(posX, posY, GameVariables.player);
    }
}