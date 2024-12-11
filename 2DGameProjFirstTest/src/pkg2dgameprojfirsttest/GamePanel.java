package pkg2dgameprojfirsttest;

import entity.Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
    //SCREEN SETTINGS
    final int originalTileSize = 16; //16x16
    final int scale = 5;
    
    public int tileSize = originalTileSize * scale; //48x48 tile size
    final int maxScreenRow = 16;
    final int maxScreenColumn = 12;
    final int screenWidth = tileSize * maxScreenRow;//768 pixels
    final int screenHeight = tileSize * maxScreenColumn;//576 
    
    //FPS
    int FPS = 60;
    
    KeyHandler keyInput = new KeyHandler();
    Thread gameThread;
    Player player = new Player(this,keyInput);
    
    //SET PLAYER DEFAULT POSITION
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    
    public GamePanel () {
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyInput);
        this.setFocusable(true);
    }
    
    public void startGameThread () {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        
        double drawInterval = 1000000000/FPS;//0.01666 seconds
        double nextDrawTime = System.nanoTime() + drawInterval;
        
        while (gameThread != null) {
            
            
            
            //UPDATE: Is to update information like character position
            update();
            
            //DRAW: draw the screen with updated information
            repaint();
            
            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;
                
                if (remainingTime < 0) {
                    remainingTime = 0;
                }
                
                Thread.sleep((long)remainingTime);
                
                nextDrawTime += drawInterval;
                
            } catch (Exception e) {
            }
            
        }
    }
     
    public void update () {//NON-DIAGONAL MOVEMENT
        player.update();
    }
    /*
    public void update() { DIAGONAL MOVEMENT
    if (keyInput.upPressed) {
        playerY -= playerSpeed;
    }
    if (keyInput.downPressed) {
        playerY += playerSpeed;
    }
    if (keyInput.leftPressed) {
        playerX -= playerSpeed;
    }
    if (keyInput.rightPressed) {
        playerX += playerSpeed;
    }
}

    */
    
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        player.draw(g2);
        g2.dispose();
    }
    
}
