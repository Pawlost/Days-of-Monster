package Game;
import Engine.GameVariables;
import Game.Entíties.Player;
import Game.GameObjects.Ground;
import javafx.scene.layout.GridPane;

public class Map {
    private Ground[][] map = new Ground[GameVariables.mapSize][GameVariables.mapSize];
    private String name;
    GridPane context;

    public Map(String name, GridPane context){
        this.name = name;
        this.context = context;
        CreateMap();
        CreateEntities();
    }

    public void CreateMap(){
        for (int posY = 0; posY < GameVariables.mapSize; posY++) {
            for(int posX=0; posX < GameVariables.mapSize; posX++) {
                map[posY][posX] = new Ground(posX, posY);
                map[posY][posX].renderObject(context);
            }
        }
    }

    private void CreateEntities(){
        map[1][2].addEntity(new Player(1, 2), context);
    }
}
