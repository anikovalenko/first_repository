package org.example.sorting_algorithms;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        int[] sortedArray = bubble.sort();
        System.out.println(Arrays.toString(sortedArray));

        Selection selection = new Selection();
        sortedArray = selection.sort();
        System.out.println(Arrays.toString(sortedArray));

        Insertion insertion = new Insertion();
        sortedArray = insertion.sort();
        System.out.println(Arrays.toString(sortedArray));
    }
}
