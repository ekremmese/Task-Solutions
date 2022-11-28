package day20_PracticeTasks;

import java.util.Arrays;

/*
Task
  1. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */
public class Task_MergeArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8};


        int[] merged = new int[arr1.length + arr2.length];

        //MY SOLUTION WITH FOR LOOPS

        for (int i = 0, j = 0; i < arr1.length; j++, i++) {

            merged[j] = arr1[i];

        }

        for (int i = 0, j = arr1.length; i < arr2.length; j++, i++) {

            merged[j] = arr2[i];

        }


        System.out.println(Arrays.toString(merged));




        System.out.println("=====================================");
        // MUHTAR'S SOLUTION FOR EACH LOOP

        int i = 0;

        for (int each : arr1) {
            merged[i++] *= each;
        }
        for (int each : arr2) {
            merged[i++] *= each;
        }

        System.out.println(Arrays.toString(merged));


    }
}
