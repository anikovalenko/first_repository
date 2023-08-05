package org.example.java.java_interview.array;

public class Average {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(calculateAvg(array));;
    }

    static double calculateAvg(int[] array){
        int sum = 0;
        for(int currentInt: array){
            sum += currentInt;
        }
        return (double)sum / array.length;
    }

}
