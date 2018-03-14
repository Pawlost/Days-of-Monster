/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entíties;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import monsterengine.GameVariables;
import monsterengine.menu.GUI;

/**
 *
 * @author balda
 */
public class Player extends JPanel{
    private Image scaledPlayerImage;
    private Image playerImage;
    public Player(){
        try {
            playerImage = ImageIO.read(GameVariables.player);
            scaledPlayerImage = playerImage.getScaledInstance(40,40,Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }
        @Override
    public Dimension getPreferredSize() {
        return new Dimension(350, 300);
    }
       @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(scaledPlayerImage, 0, 0,40,40, null);
                g.dispose();
            }
}
