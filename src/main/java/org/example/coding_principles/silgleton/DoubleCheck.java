package org.example.coding_principles.silgleton;

public class DoubleCheck {

    private final String data;
    private static volatile DoubleCheck instance;
    // volatile keyword protects the object from partial initialisation.

    private DoubleCheck(String data) {
        this.data = data;
    }

    //the Singleton pattern's this subtype calls Double Check because of double-checking the instance's initialisation
    static DoubleCheck getInstance(String data) {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck(data);
                }
            }
        }
        return instance;
    }
}
