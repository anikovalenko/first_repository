package org.example.java.java_collections;

import java.util.ArrayList;
import java.util.List;

public class SortedSetsCombiner {

    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        first.add(1);
        first.add(2);
        first.add(4);
        first.add(5);
        first.add(7);

        second.add(1);
        second.add(3);
        second.add(4);

        System.out.println(combine(first, second));
    }

    private static List<Integer> combine(List<Integer> first, List<Integer> second) {
        List<Integer> newList = new ArrayList<>();
        int index = 0;
        while (index < first.size() && index < second.size()) {
            if(first.get(index) > second.get(index)){
                newList.add(second.get(index));
                newList.add(first.get(index));
            }else {
                newList.add(first.get(index));
                newList.add(second.get(index));
            }
            index++;
        }
        if(first.size() != second.size()){
            List<Integer> longerList = index < first.size() - 1 ? first : second;
            for (int i = index; i < longerList.size(); i++) {
                newList.add(longerList.get(i));
            }
        }

        return newList;
    }

}
