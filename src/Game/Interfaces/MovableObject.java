package Game.Interfaces;
import Game.GameObjects.Ground;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public interface MovableObject {
    void setMovable(Pane p);
    void move(int posX, int posY);
    void activeViewZone();
    void select();
    void deselect();
}
