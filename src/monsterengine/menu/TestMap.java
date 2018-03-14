/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterengine.menu;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Game.GameObjects.Ground;

public class TestMap extends JFrame {

    private JPanel drawingBoard;

    private static final int GAP = 5;
    private JPanel[][] map = new Ground[10][10];
    private JButton btn;

    public TestMap() {

        super("Monster Engine");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        JPanel pane = new Ground(0,0);

        this.add(pane);
        this.pack();

        this.setSize(900, 600);
        this.setVisible(true);
    }
}