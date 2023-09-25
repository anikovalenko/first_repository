package org.example.sorting_algorithms;

public class Selection {

    private int[] array = {4, 2, 0, 7, 9, 1, 5, 3};

    int[] sort() {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
