package com.itzilly.treasureHunt.ui;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private Timer timer;

    public GamePanel() {
        initializeLayout();
        startAnimation();
    }

    private void initializeLayout() {
        setPreferredSize(new Dimension(600, 600));
        setFocusable(true);
        setBackground(Color.BLACK);
    }

    private void startAnimation() {
        timer = new Timer(1000, new GameLoop(this));
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        handleCanvas(g);
    }

    private void handleCanvas(Graphics g) {
    }

    public void loop() {
        repaint();
    }
}
