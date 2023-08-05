package org.example.java.java_oop;

public class Rectangle {

    private static int calculateArea(int height, int width) {
        return (width + height) * 2;
    }

    public static void main(String[] args) {
        System.out.println(calculateArea(10,20));
    }
}
