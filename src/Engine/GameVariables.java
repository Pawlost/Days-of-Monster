/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

import java.io.File;

public class GameVariables {
    public static int mapSize = 10;
    public static int gameObjectSize = 40;
    public static int entityObjectSize = 60;

    public static File player = new File("./Textures/Entities/Player/LivePlayer.png");
    public static File ground = new File("./Textures/GameObjects/Ground.png");
}
