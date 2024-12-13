package tile;

import java.awt.Graphics2D;
import java.io.IOException;
import javax.imageio.ImageIO;
import pkg2dgameprojfirsttest.GamePanel;

public class TileManager {
    GamePanel gp;
    Tile[] tile;
    
    public TileManager(GamePanel gp) {
        this.gp = gp;
        
        tile = new Tile[50];
        
        getTileImage();
    }
    
    public void getTileImage() {
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall room top.png"));
            
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall room middle.png"));
            
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall room bottom.png"));
            
            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1.jpg"));
            
            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_2.jpg"));
            
            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_3.jpg"));
            
            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_4.jpg"));
            
            tile[7] = new Tile();
            tile[7].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_5.jpg"));
            
            tile[8] = new Tile();
            tile[8].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_6.jpg"));
            
            tile[9] = new Tile();
            tile[9].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_3_wall.jpg"));
            
            tile[10] = new Tile();
            tile[10].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_6_floor.jpg"));
            
            tile[11] = new Tile();
            tile[11].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_4_door.jpg"));
            
            tile[12] = new Tile();
            tile[12].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_5_bottom.jpg"));
            
            tile[13] = new Tile();
            tile[13].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_blackboard_1.jpg"));
            
            tile[14] = new Tile();
            tile[14].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_blackboard_2.jpg"));
            
            tile[15] = new Tile();
            tile[15].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_blackboard_3.jpg"));
            
            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_table.jpg"));
            
            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_student_table.jpg"));
            
            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_chair.jpg"));
            
            tile[19] = new Tile();
            tile[19].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_pinboard.jpg"));
            
            tile[20] = new Tile();
            tile[20].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_books.jpg"));
            
            tile[21] = new Tile();
            tile[21].image = ImageIO.read(getClass().getResourceAsStream("/tiles/Asset_1_flower.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void draw(Graphics2D g2) {
        
        g2.drawImage(tile[11].image, 96, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 144, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 192, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 240, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[13].image, 288, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[15].image, 336, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[15].image, 384, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[15].image, 432, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[14].image, 480, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 528, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[19].image, 576, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[0].image, 624, 48, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 48, gp.tileSize, gp.tileSize, null);
        
        g2.drawImage(tile[10].image, 96, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 144, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 192, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 240, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 288, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 336, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[16].image, 384, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[20].image, 528, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[20].image, 576, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[20].image, 624, 96, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 96, gp.tileSize, gp.tileSize, null);
        
        g2.drawImage(tile[10].image, 96, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 144, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 192, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 240, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 288, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 336, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 144, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 144, gp.tileSize, gp.tileSize, null);
        
        g2.drawImage(tile[10].image, 96, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 144, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 192, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 240, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 288, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 336, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 384, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 480, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 576, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 192, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 192, gp.tileSize, gp.tileSize, null);
        
        g2.drawImage(tile[10].image, 96, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 144, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 192, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 240, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 288, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 336, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 384, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 480, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 576, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 240, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 240, gp.tileSize, gp.tileSize, null);
        
        g2.drawImage(tile[10].image, 96, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 144, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 192, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 240, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 288, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 336, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 384, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 480, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 576, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 288, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 288, gp.tileSize, gp.tileSize, null);
        
        g2.drawImage(tile[10].image, 96, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 144, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 192, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 240, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 288, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 336, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 384, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 480, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[17].image, 576, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 336, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 336, gp.tileSize, gp.tileSize, null);
        
        g2.drawImage(tile[10].image, 96, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 144, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 192, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 240, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 288, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 336, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 384, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 432, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 480, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 528, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[18].image, 576, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[10].image, 624, 384, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 384, gp.tileSize, gp.tileSize, null);
        
        g2.drawImage(tile[12].image, 96, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 144, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 192, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 240, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 288, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 336, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 384, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 432, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 480, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 528, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 576, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[12].image, 624, 432, gp.tileSize, gp.tileSize, null);
        g2.drawImage(tile[9].image, 663, 432, gp.tileSize, gp.tileSize, null);
    }
}
