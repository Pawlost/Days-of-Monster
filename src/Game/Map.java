package Game;

import Engine.Entíties.Player;
import Engine.GameVariables;

import javax.swing.*;

public class Map {
    private Ground[][] map = new Ground[GameVariables.mapSize][GameVariables.mapSize];
    private JFrame context;
    private String name;

    public Map(String name, JFrame context){
        this.name = name;
        this.context = context;
        CreateMap();
        CreateEntities();
    }

    private void CreateMap(){
        for (int posY = 0; posY < GameVariables.mapSize; posY++) {
            for(int posX=0; posX < GameVariables.mapSize; posX++) {
                map[posY][posX] = new Ground(posX, posY);
                map[posY][posX].addOnMap(context);
            }
        }
    }

    private void CreateEntities(){
        Player p = new Player(1,1);
        map[1][1].addPlayer(p);
    }
}
