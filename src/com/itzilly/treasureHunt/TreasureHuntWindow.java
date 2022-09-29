package com.itzilly.treasureHunt;

import javax.swing.*;
import java.awt.*;

public class TreasureHuntWindow {
    private final int WINDOW_HEIGHT = 600;
    private final int WINDOW_WIDTH = 600;

    private final JFrame window;
    public TreasureHuntWindow(String title) {
        // The Main Game Window
        window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle(title);
        window.setLocationRelativeTo(null);
        window.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        window.setMaximumSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        window.setMinimumSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    }


    public void show() {
        // Show The Main Window
        window.setVisible(true);
    }
}
