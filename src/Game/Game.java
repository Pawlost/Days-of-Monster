package Game;

public class Game {

    public static void main(String[] args) {
        createGame();
    }

    public static void createGame() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                World game = new World();
                game.setLocationRelativeTo(null);
                game.setVisible(true);
            }
        });
    }
}
