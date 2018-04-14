
package Game.Entíties;

import Game.GameObjects.GameObject;
import Engine.GameVariables;

public class Player extends GameObject {

    public Player(int posX, int posY) {
        super(posX, posY, GameVariables.entityObjectSize, GameVariables.entityObjectSize);
    }
}