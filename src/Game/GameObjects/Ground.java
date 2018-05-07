package Game.GameObjects;

import Engine.GameVariables;
import Game.CombatMap;
import Game.Entíties.Entity;
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
    private CombatMap scene;
    private Pane zoneObject;

    public Ground(int posX, int posY, GridPane root, CombatMap scene) {
        super(posX, posY, GameVariables.gameObjectSize, GameVariables.gameObjectSize, root);
        Image groundImage = GameVariables.groundImage;
        this.scene = scene;
        zoneObject = new Pane();
        Rectangle rec = new Rectangle(width, height);
        rec.setFill(new ImagePattern(GameVariables.zoneImage, 0, 0, 1, 1, true));
        zoneObject.getChildren().add(rec);
        object.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                select();
            }
        });
        renderObject(groundImage);
    }

   public void select(){
        try {
            if(scene.getMainPlayer().isSelected() && isActivated) {
                scene.getMainPlayer().move(posX, posY);
            }
        } catch (NullPointerException e){
            System.out.println("Player is not selected.");
       }
   }

    public void addEntity(Entity entity){
        if(isOpen) {
            entity.renderEntity(super.width, width);
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

    public boolean isActivated() {
        return isActivated;
    }
}
