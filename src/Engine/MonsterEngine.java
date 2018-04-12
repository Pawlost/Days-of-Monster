/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engine;

public class MonsterEngine {
    private Editor editor;

    public static void main(String[] args) {
        createEditor();
    }

    private static void createEditor() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editor editor = new Editor();
                editor.setLocationRelativeTo(null);
                editor.setVisible(true);
            }
        });
    }
}
