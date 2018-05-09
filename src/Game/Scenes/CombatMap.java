package Game.Scenes;
import Engine.GameVariables;
import Game.Entíties.FMonster;
import Game.GameObjects.Ground;
import javafx.scene.layout.GridPane;


public class CombatMap {
    private Ground[][] map = new Ground[GameVariables.mapSize][GameVariables.mapSize];
    private GridPane context;
    private FMonster[] FMonsters;
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
        FMonsters = new FMonster[]{new FMonster(1, 1, context, map), new FMonster(1, 4, context, map)};
    }
    public FMonster getMainPlayer(){
        for (FMonster FMonster : FMonsters) {
            if (FMonster.isSelected()){
                return FMonster;
            }
        }
        return null;
    }
    public FMonster getPlayerOnPositon(int posX, int posY){
        for (FMonster FMonster : FMonsters) {
            if (FMonster.getPosX() == posX && FMonster.getPosY() == posY){
                return FMonster;
            }
        }
        return null;
    }
}
