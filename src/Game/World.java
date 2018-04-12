package Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class World extends JFrame{

    World() {
        super("Game World");
        String[] data = {"Map", "Map2"};
        initBasicGUI();

        ArrayList<Map> maps = new ArrayList<>();
        maps.add(new Map("Map 1",this));

        JList something = new JList(data);
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
