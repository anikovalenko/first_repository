package org.example.java.java_print;

public class SmilePrinter {
    /*
    Expected Output
     +"""""+
    [| o o |]
     |  ^  |
     | '-' |
     +-----+
     */

    public static void main(String[] args) {
        String goodMood = "happy";
        String badMood = "sad";

        printSmile(goodMood);
        printSmile(badMood);
    }

    static void printSmile(String mood) {
        System.out.printf("%2c%2$c%2$c%2$c%2$c%2$c%1$c%n", '+', '"');
        System.out.printf("%c%c %c %3$c %2$c%4$c%n", '[', '|', 'o', ']');
        System.out.printf(" %-3c%-3c%1$c%n", '|', '^');
        if (mood.equals("happy")){
            System.out.printf(" %-2c%s%c%2$s %1$c%n", '|', "'", '-');
        }else if(mood.equals("sad")){
            System.out.printf(" %-2c%c%c%2$c %1$c%n", '|', ',', '-');
        }
        System.out.printf("%2c%2$c%2$c%2$c%2$c%2$c%1$c%n", '+', '"');
        System.out.println();
    }
}

