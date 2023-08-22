package org.example.java.java_interview;
//is not complete

/*
Input: strs = ["flower","flow","flight"]
Output: "fl"

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

import java.util.ArrayList;
import java.util.List;

public class LongestPrefixFinder {

    static int index = 0;

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("flower");
        strings.add("flow");
        strings.add("flight");

        List<String> strings2 = new ArrayList<>();
        strings2.add("dog");
        strings2.add("rececar");
        strings2.add("car");

        System.out.println("1st list. version 1: " + findPrefixV1(strings));
        System.out.println("2nd list. version 1: " + findPrefixV1(strings2));
    }

    static String findPrefixV1(List<String> strings) {
        String mutualPart = "";
        for (int i = 0; i < strings.size(); i++) {
            char[] first = strings.get(i).toCharArray();
            char[] second = strings.get(i + 1).toCharArray();
            for (int j = 0; j < first.length; j++) {
                if (first[i] == second[i]) {
                    mutualPart += first[i];
                }
            }
        }
        return "";
    }

    static String findPrefixV2(List<String> strings){
        String mutualPart = strings.get(0);
        for(String str: strings){
           if(str.contains(mutualPart+"*")){

           }
        }
        return "";
    }
}
