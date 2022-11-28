package day21_PracticeTasks;

import java.util.Arrays;

public class Task1_DescendingOrder {

    /*
    1. Write a program that sort the array of integer in descending order
     */

    public static void main(String[] args) {

        int[] numbers = {3, 5, 6, 1, 0, 2};

        Arrays.sort(numbers);

        int[] reversed = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(reversed));


    }
}
