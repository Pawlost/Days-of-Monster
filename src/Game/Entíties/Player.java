
package Game.Entíties;

import Engine.GameVariables;

public class Player extends Entity {
    public Player(int posX, int posY) {
        super(posX, posY, GameVariables.entityObjectSize, GameVariables.entityObjectSize, GameVariables.playerImage);
    }
}