package org.example.coding_principles.solid;

public class PremiumVideo implements IVideoActions {
    private int premiumID;
    private VideoManager manager;

    public double getNumberOfHours() {
        return manager.getNumberOfHours();
    }
}
