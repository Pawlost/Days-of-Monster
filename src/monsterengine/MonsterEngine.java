/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterengine;

import monsterengine.menu.GUI;

public class MonsterEngine{

    public static void main(String[] args) {
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUI hlavniJFrame = new GUI();
        hlavniJFrame.setLocationRelativeTo(null);
        hlavniJFrame.setVisible(true);
            }
        });
   
    }
}
