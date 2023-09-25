package org.example.sorting_algorithms;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Insertion {

    private int[] array = {4, 2, 0, 7, 9, 1, 5, 3};

    int[] sort() {
        for (int i = 0; i < array.length - 1; i++) {
            int point = i;
            while (point >= 0 && array[point + 1] < array[point]) {
                int temp = array[point];
                array[point] = array[point + 1];
                array[point + 1] = temp;
                point--;
            }
        }
        return array;
    }

}
