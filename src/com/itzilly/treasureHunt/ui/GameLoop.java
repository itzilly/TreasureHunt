package com.itzilly.treasureHunt.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLoop implements ActionListener {

    private final GamePanel gamePanel;

    public GameLoop(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        gamePanel.loop();
    }
}
