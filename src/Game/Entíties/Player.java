package Game.Entíties;import Engine.GameVariables;import Game.GameObjects.Ground;import Game.Interfaces.MovableObject;import javafx.event.EventHandler;import javafx.scene.input.MouseEvent;import javafx.scene.layout.GridPane;import javafx.scene.layout.Pane;import javafx.scene.shape.Line;public class Player extends Entity implements MovableObject {    private boolean isSelected = false;    private Line selectedLine = new Line();    private Ground[][] map;    public Player(int posX, int posY, GridPane root, Ground[][] map) {        super(posX, posY, GameVariables.entityObjectSize, GameVariables.entityObjectSize, GameVariables.playerImage, root);        this.map = map;        spawn();        setMovable(getObject());    }    public void spawn(){        map[getPosY()][getPosX()].addEntity(this);    }    @Override    public void setMovable(Pane p) {        p.setOnMouseClicked(new EventHandler<MouseEvent>() {            @Override            public void handle(MouseEvent event) {                activeViewZone();                if (isSelected) {                    deselect();                } else {                    select();                }            }        });    }    @Override    public void move(int posX, int posY) {        deselect();        for(Ground[] grY:map){            for(Ground grX:grY){                grX.removeZone();                grX.setActivated(false);            }        }        setPosition(posX, posY);        renderEntity(getOriginObjectWidth(), getOriginObjectHeight());        spawn();    }    @Override    public void activeViewZone() {        for (int y = -1; y < 2; y++) {            for (int x = -1; x < 2; x++) {                if (getPosX() + x >= 0 && getPosY() + y >= 0 && getPosX() + x < GameVariables.mapSize && getPosY() + y < GameVariables.mapSize) {                    if (getPosX() + x != getPosX() || getPosY() + y != getPosY())                        map[getPosY() + y][getPosX() + x].activateZone();                }            }        }    }    @Override    public void select() {        isSelected = true;        selectedLine.setStrokeWidth(GameVariables.selectedLineSize);        selectedLine.setStartX((getOriginObjectWidth() - getWidth())/2);        selectedLine.setStartY((getOriginObjectHeight() - getHeight())/2);        selectedLine.setEndX((getOriginObjectWidth() - getWidth())/2 + getWidth());        selectedLine.setEndY((getOriginObjectHeight() - getHeight())/2 + getHeight());        super.getObject().getChildren().add(selectedLine);    }    @Override    public void deselect() {        isSelected = false;        super.getObject().getChildren().remove(selectedLine);    }    public boolean isSelected() {        return isSelected;    }}