package org.example.java.java_interview;

public class PalindromeNumber {

    private static final StringBuilder stringBuilder = new StringBuilder();

    private static boolean isPalindromeV1(int num) {
        int index = 0;
        String s = String.valueOf(num);
        for (int i = s.length() - 1; i >= s.length() / 2; i--) {
            if (s.charAt(index++) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromeV2(int num) {
        listMaking(num);
        int reversedNum = Integer.parseInt(String.valueOf(stringBuilder));
        return reversedNum == num;
    }

    private static void listMaking(int num) {
        if (num == 0) {
            return;
        }
        int i = num % 10;
        stringBuilder.append(i);
        listMaking(num / 10);
    }

    public static void main(String[] args) {
        int num = 151;
        System.out.println("Version 1 -> " + num + " is Palindrome: " + isPalindromeV1(num));
        System.out.println("Version 2 -> " + num + " is Palindrome: " + isPalindromeV2(num));
    }
}
