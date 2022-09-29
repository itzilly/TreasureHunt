package com.itzilly.treasureHunt;


public class TreasureHunt {
    public static String VERSION = "alpha-0.0.1";
    public static String BUILD_VERSION = "b1";
    public static TreasureHuntWindow treasureHuntWindow = new TreasureHuntWindow("Treasure Hunt v" + VERSION + BUILD_VERSION);

    public static void main(String[] args) {
        System.out.println("Starting Treasure Hunt v" + VERSION + BUILD_VERSION);
        treasureHuntWindow.show();
    }
}
