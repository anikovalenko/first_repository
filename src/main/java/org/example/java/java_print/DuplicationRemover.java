package org.example.java.java_print;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicationRemover {

    /*
    Original List with duplicate elements:
    12->12->13->14->15->15->16->17->17

    After removing duplicates:
    12->13->14->15->16->17
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(17);

        removeManually(list);
        System.out.println(list);
//        removeViaStream(list);
//        System.out.println(list);
//        removeViaSet(list);
//        System.out.println(list);
    }

    private static void removeManually(List<Integer> list) {
//        list.remove(0);
        List<Integer> newList = new ArrayList<>(list);
//        for (int i = 0; i < newList.size() - 1; i++) {
//            for (int j = i + 1; j < newList.size(); j++) {
//                if (newList.get(i) == newList.get(j)) {
//                    newList.remove(j);
//                }
//            }
//        }
        newList.remove(0);
        System.out.println("Removing by manually: " + newList);
    }


    private static boolean isDuplicated(Integer baseNum, Integer compareNum) {
        return baseNum == compareNum;
    }


    private static void removeViaStream(List<Integer> list) {
        List<Object> newList = list.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Removing by using a stream: " + newList);
    }

    private static void removeViaSet(List<Integer> list) {
        Set<Integer> set = new TreeSet<>(list);
        System.out.println("Removing via adding in the Set: " + set);
    }
}
