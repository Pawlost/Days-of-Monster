package Engine;
import Game.Game;
import Game.Map;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Editor extends JFrame {

    public Editor() {
        super("Monster Engine Editor");
        initBasicGUI();
        Game.createGame();
    }

    private void initBasicGUI(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        this.pack();
        this.setSize(900, 600);
        this.setVisible(true);
    }

}
