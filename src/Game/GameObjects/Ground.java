package Game.GameObjects;

import Engine.GameVariables;
import Game.Entíties.Entity;
import Game.GameControl;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Ground extends GameObject {
    private boolean isActivated;
    private boolean isOpen = true;
    private Pane zoneObject;
    private GameControl gc;

    public Ground(int posX, int posY, GridPane root) {
        super(posX, posY, GameVariables.gameObjectSize, GameVariables.gameObjectSize, root);
        Image groundImage = GameVariables.groundImage;

        zoneObject = new Pane();
        Rectangle rec = new Rectangle(getWidth(),getHeight());
        rec.setFill(new ImagePattern(GameVariables.zoneImage, 0, 0, 1, 1, true));
        zoneObject.getChildren().add(rec);

        renderObject(groundImage);

        getObject().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                select();
            }
        });
    }

   public void select(){
       if(gc.getPlayer().isSelected() && isActivated) {
           gc.getPlayer().move(getPosX(), getPosY());
       }
   }

    public void addEntity(Entity entity){
        if(isOpen) {
            entity.renderEntity(super.getWidth(), super.getHeight());
        }
    }

    public void activateZone(){
        if(isActivated) {
        isActivated = false;
        }else {
            isActivated =true;
        }
        addObject(zoneObject);
    }

    public void removeZone(){
        removeAll(zoneObject);
    }

    public void setActivated(boolean activate) {
        isActivated = activate;
    }

    public void setGameControl(GameControl gc){
        this.gc = gc;
    }

}
