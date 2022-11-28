package day20_PracticeTasks;

import java.util.Arrays;

public class Task5_ReversedArray {

    /*
    5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

     */


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] reversedArray = new int[numbers.length];
        int i = 0;
        for (int i1 = reversedArray.length - 1; i1 >= 0; i1--, i++) {
            reversedArray[i1] = numbers[i];
        }

        System.out.println(Arrays.toString(reversedArray));

    }
}
