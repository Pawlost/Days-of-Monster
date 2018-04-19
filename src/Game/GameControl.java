package Game;

import Game.Entíties.Player;
import Game.GameObjects.Ground;

public class GameControl {
    private boolean isPlayerSelected;
    private Player player;
    private Ground[][] map;

    public GameControl(Ground[][] map, Player player){
        this.map = map;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
