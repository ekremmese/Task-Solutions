package day25_PracticeTasks;

import java.util.Arrays;

public class Task1__MergeArrays {
    /*
    Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.
     */

    public static void main(String[] args) {

        int[] arr1 = {1, 34, 54, 0, 51};
        int[] arr2 = {1, 9, 11, 5};  // {1,34,54,0,51,1,9,11,5} // length 9 , indexes 8 ,

        int[] merged = mergeArray(arr1, arr2);

        System.out.println(Arrays.toString(merged));

        System.out.println("--------------------------------");

        double[] arr3 = {1.5, 34.0, 54.4, 1.2, 51.56};
        double[] arr4 = {5.4, 9.5, 11.2, 5.3};  // {1,34,54,0,51,1,9,11,5} // length 9 , indexes 8 ,

        double[] merged1 = mergeArray(arr3, arr4);

        System.out.println(Arrays.toString(merged1));


    }

    //Merges two int arrays
    public static int[] mergeArray(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < merged.length; i++, j++) {
            merged[i] = arr2[j];
        }
        return merged;
    }

    //Merges two double arrays
    public static double[] mergeArray(double[] arr1, double[] arr2) {

        double[] merged = new double[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < merged.length; i++, j++) {
            merged[i] = arr2[j];
        }
        return merged;
    }

    //Merges two char arrays
    public static char[] mergeArray(char[] arr1, char[] arr2) {

        char[] merged = new char[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < merged.length; i++, j++) {
            merged[i] = arr2[j];
        }
        return merged;
    }

    //Merges two char arrays
    public static String[] mergeArray(String[] arr1, String[] arr2) {

        String[] merged = new String[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = arr1.length, j = 0; i < merged.length; i++, j++) {
            merged[i] = arr2[j];
        }
        return merged;
    }
    
}
