package com.itzilly.treasureHunt;

import com.itzilly.treasureHunt.ui.MainGameFrame;

import java.awt.*;


public class TreasureHunt {
    public static String VERSION = "alpha-0.1.1";
    public static String BUILD_VERSION = "b4";
    public static String FRAME_TITLE = "Treasure Hunt v-" + VERSION + BUILD_VERSION;

    public static void main(String[] args) {
        System.out.println("Starting Treasure Hunt v" + VERSION + BUILD_VERSION);
        EventQueue.invokeLater(() -> new MainGameFrame(FRAME_TITLE));
    }
}
