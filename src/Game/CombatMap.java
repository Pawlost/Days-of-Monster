package Game;
import Engine.GameVariables;
import Game.Entíties.Player;
import Game.GameObjects.Ground;
import javafx.scene.layout.GridPane;


public class CombatMap {
    private Ground[][] map = new Ground[GameVariables.mapSize][GameVariables.mapSize];
    private GridPane context;
    private Player[] players;
    private String name;

    public CombatMap(String name, GridPane context){
        this.context = context;
        this.name = name;
        createMap();
        createEntities();
    }

    public void createMap(){
        for (int posY = 0; posY < GameVariables.mapSize; posY++) {
            for(int posX=0; posX < GameVariables.mapSize; posX++) {
                map[posY][posX] = new Ground(posX, posY, context, this);
            }
        }
    }

    private void createEntities(){
        players = new Player[]{new Player(1, 1, context, map), new Player(2, 2, context, map)};
    }
    public Player getMainPlayer(){
        for (Player player:players) {
            if (player.isSelected()){
                return player;
            }
        }
        return null;
    }
}
