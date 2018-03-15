/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterengine.menu;

import java.awt.*;
import javax.swing.*;

import Game.GameObject;
import Game.GameObjects.Ground;
import monsterengine.GameVariables;

public class TestMap extends JFrame {

    public TestMap() {

        super("Monster Engine");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.ipadx = 40;
        c.ipady = 40;
        for (int i=1; i <= GameVariables.mapSize; i++) {
            for(int i2=1; i2 <= GameVariables.mapSize; i2++) {
                Ground g = new Ground();
                c.gridx = i2;
                c.gridy = i;
                this.add(g, c);
            }
        }
        this.pack();
        this.setSize(900, 600);
        this.setVisible(true);
    }
}