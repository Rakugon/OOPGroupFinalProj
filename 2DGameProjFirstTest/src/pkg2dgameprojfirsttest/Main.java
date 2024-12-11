package pkg2dgameprojfirsttest;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Melancholy");
        
        GamePanel gamePanelAccess = new GamePanel();
        window.add(gamePanelAccess);
        
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanelAccess.startGameThread();
    }
    
}
