package org.example.coding_principles.builder.example1;

import org.example.coding_principles.builder.example1.Laptop;

public class MainApp {
    public static void main(String[] args) {
        Laptop builder = new Laptop.Builder()
                .id(123456)
                .ram(8)
                .brand("HP").build();


    }
}
