package org.example.java_print;

/*
Expected Output

* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
==============================================
==============================================
==============================================
==============================================
==============================================
==============================================
 */

public class AmericanFlagPrinter {
    private static char star = '*';
    private static char equalSign = '=';
    private static int starCount;
    private static int columnLine;


    public static void main(String[] args) {
//        theWorstVersion();
        print();
    }

    private static void theWorstVersion() {
        for (int i = 1; i <= 15; i++) {
            starCount = 0;
            columnLine = 0;
            if (i <= 9) {
                if ((i & 1) == 1) {
                    while (starCount <= 6) {
                        System.out.print(star + " ");
                        starCount++;
                        columnLine += 2;
                    }
                    while (columnLine <= 45) {
                        System.out.print(equalSign);
                        columnLine++;
                    }
                } else {
                    while (starCount <= 5) {
                        System.out.print(" " + star);
                        starCount++;
                        columnLine += 2;
                    }
                    System.out.print("  ");
                    columnLine += 2;
                    while (columnLine <= 45) {
                        System.out.print(equalSign);
                        columnLine++;
                    }
                }
                System.out.println();
            } else {
                while (columnLine <= 45) {
                    System.out.print(equalSign);
                    columnLine++;
                }
                System.out.println();
            }
        }
    }

    static void print(){
        System.out.println(String.format("%2$s %s %<s %s", "a", "b", "c", "d"));
        System.out.println(String.format("%2$s", "a", "b"));
        System.out.println(String.format("%1$s %<s", "a", "b"));
        System.out.printf("%1$c %1$c %1$c %1$c", star);
        System.out.printf("%-5c", star);
        System.out.printf("(5)%c", star);
    }
}
