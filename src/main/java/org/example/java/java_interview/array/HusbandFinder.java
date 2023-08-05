package org.example.java.java_interview.array;

public class HusbandFinder {

    public static void main(String[] args) {
        System.out.println(findHusband("Artur"));
    }

    static boolean findHusband(String name){
        String[] names = {"Armen", "Artur", "Daniel", "Leo"};
        for (String s : names) {
            if(s.equals(name)){
                return true;
            }
        }
        return false;
    }
}
