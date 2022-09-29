package com.itzilly.treasureHunt.ui;

import javax.swing.*;


public class MainGameFrame extends JFrame {
    public MainGameFrame(String FrameTitle) {
        initialize(FrameTitle);
    }

    private void initialize(String FrameTitle) {
        // Main Game Frame Contents
        add(new GamePanel());
        pack();

        // Frame Settings
        setTitle(FrameTitle);
        setIconImage(new ImageIcon("resources/icon.png").getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

}
