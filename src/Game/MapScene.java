package Game;
import Engine.GameVariables;
import Game.Entíties.Player;
import Game.GameObjects.Ground;
import javafx.scene.layout.GridPane;

public class MapScene{
    private Ground[][] map = new Ground[GameVariables.mapSize][GameVariables.mapSize];
    GridPane context;
    private String name;

    public MapScene(String name, GridPane context){
        this.context = context;
        this.name = name;
        createMap();
        createEntities();
    }

    public void createMap(){
        for (int posY = 0; posY < GameVariables.mapSize; posY++) {
            for(int posX=0; posX < GameVariables.mapSize; posX++) {
                map[posY][posX] = new Ground(posX, posY);
                map[posY][posX].renderObject(context);
            }
        }
    }

    private void createEntities(){
        map[1][2].addEntity(new Player(1, 2), context);
    }
}
