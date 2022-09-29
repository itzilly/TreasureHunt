package com.itzilly.treasureHunt;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    // Screen Settings
    final int originalTileSize = 16;  // 16x16 pixels
    final int scale = 3;  // Scalar for enlarging images to viewable size

    final int tileSize = originalTileSize * scale;  // 48x48 tile (16*3)
    final int maxScreenCollumns = 16;
    final int maxScreenRows = 12;
    final int screenWidth = tileSize * maxScreenCollumns;  // 768 pixels
    final int screenHeight = tileSize * maxScreenRows;  // 576 pixels

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);  // Better rendering performance?
    }

}
