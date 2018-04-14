package Game.GameObjects;

import Engine.GameVariables;
import Game.Entíties.Entity;
import javafx.scene.layout.GridPane;

public class Ground extends GameObject {
    private boolean isOpen = true;
    public Ground(int posX, int posY) {
        super(posX, posY, GameVariables.gameObjectSize, GameVariables.gameObjectSize, GameVariables.groundImage);
    }
    public void addEntity(Entity entity, GridPane root){
        if(isOpen) {
            entity.renderEntity(root);
        }
    }
}
