package entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import pkg2dgameprojfirsttest.GamePanel;
import pkg2dgameprojfirsttest.KeyHandler;

public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;
    
    public Player (GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;
        
        setDefaultValues();
        getPlayerImage();
    }
    
    public void setDefaultValues () {
        x = 100;
        y = 100;
        speed = 2;
        direction = "down";
    }
    
    public void getPlayerImage () {
        try {
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/Female1_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/Female1_down_2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void update () {
        if (keyH.upPressed == true) {
            y -= speed;
        } else if (keyH.downPressed == true) {
            direction = "down";
            y += speed;
        } else if (keyH.leftPressed == true) {
            x -= speed;
        } else if (keyH.rightPressed == true) {
            x += speed;
        }
    }
    
    
    public void draw (Graphics2D g2) {
        //g2.setColor(Color.white);
        //g2.fillRect(x, y, gp.tileSize, gp.tileSize);
        
        BufferedImage image = null;
        
        switch (direction) {
            case "down":
                image = down1;
                break;
        }
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    }
    
}
