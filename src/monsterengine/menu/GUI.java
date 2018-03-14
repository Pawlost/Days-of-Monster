/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterengine.menu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import monsterengine.GameVariables;

public class GUI extends JFrame {
    
    private JPanel drawingBoard; 
    
    private BufferedImage panetp;
    
     private static final int GAP = 5;
    private BufferedImage playerImage;
    private JLabel[][] map = new JLabel[10][10];
    private JButton btn;
    public GUI(){
           
        super("Monster Engine");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        Label pico = new Label();
        
        pico.setText("Pico");
        this.setLayout(new BorderLayout());
        
        drawingBoard = new JPanel();
        this.setContentPane(drawingBoard);
           
        JPanel pane = new JPanel(new BorderLayout(2, 2));
         
        this.add(pane);
        this.pack();
        
        this.setSize(900, 600);
        this.setVisible(true);
    }
    
}
