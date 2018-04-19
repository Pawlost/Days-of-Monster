package Game;
import Engine.GameVariables;
import Game.Entíties.Player;
import Game.GameObjects.Ground;
import javafx.scene.layout.GridPane;

public class Map {

    private Ground[][] map = new Ground[GameVariables.mapSize][GameVariables.mapSize];
    private Player player;

    private String name;
    private GameControl gc;
    GridPane context;

    public Map(String name, GridPane context){
        this.name = name;
        this.context = context;
        CreateMap();
        CreateEntities();
        CreateWorld();
    }
//Map
    public void CreateMap(){
        for (int posY = 0; posY < GameVariables.mapSize; posY++) {
            for(int posX=0; posX < GameVariables.mapSize; posX++) {
                map[posY][posX] = new Ground(posX, posY, context);
            }
        }
    }
//Entities
    private void CreateEntities(){
        player = new Player(1, 2, context, map);
    }
//UI
    private void CreateWorld(){
        gc = new GameControl(map, player);
        for(Ground[] grY:map){
            for(Ground grX:grY){
                grX.setGameControl(gc);
            }
        }
    }
}
