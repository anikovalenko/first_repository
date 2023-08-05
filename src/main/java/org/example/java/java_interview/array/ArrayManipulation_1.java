package org.example.java.java_interview.array;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayManipulation_1 {

    static void findTargets(int[] array, int target) {
        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum == target) {
                    System.out.print(array[i] + " " + array[j]);
                    System.out.println();
                    contains = true;
                }
            }
        }
        if (!contains) {
            System.out.println("There are no elements equals to " + target);
        }
    }

    static Map<Integer, List<Integer>> findAndPutIntoMap(int[] array, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Integer index = 0;
        boolean contains = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (sum == target) {
                    List<Integer> pair = List.of(array[i], array[j]);
                    map.put(index++, pair);
                    contains = true;
                }
            }
        }
        if (!contains) {
            System.out.println("There are no elements equals to " + target);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        findTargets(array, 9);
        System.out.println(findAndPutIntoMap(array, 9));
    }
}
