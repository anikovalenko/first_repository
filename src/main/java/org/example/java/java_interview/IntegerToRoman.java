package org.example.java.java_interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerToRoman {
    List<Integer> roundedNums = new ArrayList<>();

    private Map<Integer, String> romanEncodingMaking() {
        Map<Integer, String> romanEncoding = new HashMap<>();
        romanEncoding.put(1, "I");
        romanEncoding.put(2, "II");
        romanEncoding.put(3, "III");
        romanEncoding.put(4, "IV");
        romanEncoding.put(5, "V");
        romanEncoding.put(6, "VI");
        romanEncoding.put(7, "VII");
        romanEncoding.put(8, "VIII");
        romanEncoding.put(9, "IX");

        romanEncoding.put(10, "X");
        romanEncoding.put(20, "XX");
        romanEncoding.put(30, "XXX");
        romanEncoding.put(40, "XL");
        romanEncoding.put(50, "L");
        romanEncoding.put(60, "LX");
        romanEncoding.put(70, "LXX");
        romanEncoding.put(80, "LXXX");
        romanEncoding.put(90, "XC");

        romanEncoding.put(100, "C");
        romanEncoding.put(200, "CC");
        romanEncoding.put(300, "CCC");
        romanEncoding.put(400, "CD");
        romanEncoding.put(500, "D");
        romanEncoding.put(600, "DC");
        romanEncoding.put(700, "DCC");
        romanEncoding.put(800, "DCC");
        romanEncoding.put(900, "CM");

        romanEncoding.put(1000, "M");
        romanEncoding.put(2000, "MM");
        romanEncoding.put(3000, "MMM");
        romanEncoding.put(4000, "M(V)̅");
        romanEncoding.put(5000, "(V)̅");
        romanEncoding.put(6000, "(V)̅M");
        romanEncoding.put(7000, "(V)̅MM");
        romanEncoding.put(8000, "(V)̅MMM");
        romanEncoding.put(9000, "(IX)̅");
        romanEncoding.put(10000, "(X)̅");
        return romanEncoding;
    }

    String convert(String numToConvert) {
        int length = numToConvert.length();
        int number = Integer.parseInt(numToConvert);
        List<Integer> roundedNums = divideTheNum(number, length);
        Map<Integer, String> romanEncoding = romanEncodingMaking();
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer roundedNum : roundedNums) {
            String s = romanEncoding.get(roundedNum);
            stringBuilder.append(s);
        }
        return String.valueOf(stringBuilder);
    }

    private List<Integer> divideTheNum(int number, int length) {
        if (length == 0) {
            System.out.println(roundedNums);
            return roundedNums;
        }
        int denominator = switch (length) {
            case 4 -> 1000;
            case 3 -> 100;
            case 2 -> 10;
            default -> 1;
        };
        int firstNum = number / denominator;
        int roundedNum = firstNum * denominator;
        int reminder = number - roundedNum;
        roundedNums.add(roundedNum);
        int newLength = length - 1;
        divideTheNum(reminder, newLength);
        return roundedNums;
    }

    public static void main(String[] args) {
        IntegerToRoman object = new IntegerToRoman();
        System.out.println(object.convert("9752"));
    }
}
