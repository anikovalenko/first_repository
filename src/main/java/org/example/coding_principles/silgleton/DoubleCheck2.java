package org.example.coding_principles.silgleton;

public class DoubleCheck2 {

    private final String data;
    private static volatile DoubleCheck2 instance;

    private DoubleCheck2(String data) {
        this.data = data;
    }

    static DoubleCheck2 getInstance(String data) {
        DoubleCheck2 closerInstance = instance;
        if (closerInstance == null) {
            synchronized (DoubleCheck2.class) {
                if (closerInstance == null) {
                    instance = closerInstance = new DoubleCheck2(data);
                }
            }
        }
        return instance;
    }
}
