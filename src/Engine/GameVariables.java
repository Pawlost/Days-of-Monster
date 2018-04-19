/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import javafx.scene.image.Image;

public class GameVariables {
    public static int mapSize = 10;
    public static int gameObjectSize = 60;
    public static int entityObjectSize = 40;
    public static int selectedLineSize = 5;

    public static Image groundImage = new Image("file:src/Curator/Textures/GameObjects/Ground.png");
    public static Image playerImage = new Image("file:src/Curator/Textures/Entities/Player/LivePlayer.png");
    public static Image zoneImage = new Image("file:src/Curator/Textures/GameObjects/ControlZone.png");
    /*---------------------------------------------------------
    MAP1
    */
    public static int playerOnMap = 2;
}
