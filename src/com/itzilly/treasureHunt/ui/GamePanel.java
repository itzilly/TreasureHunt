package com.itzilly.treasureHunt.ui;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel() {
        initializeLayout();
    }

    private void initializeLayout() {
        setPreferredSize(new Dimension(600, 600));
        setFocusable(true);
    }

}
