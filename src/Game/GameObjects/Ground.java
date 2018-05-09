package Game.GameObjects;

import Engine.GameVariables;
import Game.Scenes.CombatMap;
import Game.Entíties.Entity;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Ground extends GameObject {
    private boolean isActivatedZone;
    private boolean isClosed = false;
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
                selectGround();
            }
        });
        renderObject(groundImage);
    }

   public void selectGround(){
        try {
            if(!isClosed && isActivatedZone) {
                if (scene.getMainPlayer().isSelected()) {
                    scene.getMainPlayer().move(posX, posY);
                }
            }
        } catch (NullPointerException e){
            System.out.println("FMonster is not selected.");
       }
   }

    public void activateZone(){
        if(!isClosed) {
            isActivatedZone = true;
            addObject(zoneObject);
        }
    }
    public void deactivateZone(){
        isActivatedZone = false;
        removeZone();
    }
    public void closeGround(boolean isClosed){
        this.isClosed = isClosed;
    }

    public void removeZone(){
        removeAll(zoneObject);
    }

    public void setActivated(boolean activate) {
        isActivatedZone = activate;
    }

    public boolean isActivated() {
        return isActivatedZone;
    }
}
