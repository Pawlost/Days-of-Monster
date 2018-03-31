/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.menu;

import java.awt.*;
import javax.swing.*;

import Game.Entíties.Player;
import Game.GameObjects.Ground;
import monsterengine.GameVariables;

public class TestMap extends JFrame {
    private Ground[][] map= new Ground[GameVariables.mapSize][GameVariables.mapSize];

    public TestMap() {
        super("Monster Engine");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        CreateMap();
        CreateEntities();
        this.pack();
        this.setSize(900, 600);
        this.setVisible(true);
    }
    private void CreateMap(){
        for (int posY=0; posY < GameVariables.mapSize; posY++) {
            for(int posX=0; posX < GameVariables.mapSize; posX++) {
                map[posY][posX] = new Ground(posX, posY);
                map[posY][posX].addOnMap(this);
            }
        }
    }

    private void CreateEntities(){
        Player p = new Player(1,1);
        map[1][1].addPlayer(p);
    }
}