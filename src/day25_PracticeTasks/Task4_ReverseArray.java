package day25_PracticeTasks;

import java.util.Arrays;

public class Task4_ReverseArray {
    /*
Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
     */

    public static void main(String[] args) {


        int[] arr1 = {1, 34, 54, 0, 51};

        int[] reversed = reverseArr(arr1);

        System.out.println(Arrays.toString(reversed));

        System.out.println("---------------------------------------");

        double[] arr3 = {1.5, 34.0, 54.4, 1.2, 51.56};
        
        double[] reversed1 = reverseArr(arr3);

        System.out.println(Arrays.toString(reversed1));

    }

    //reverses int array , returns int array
    public static int[] reverseArr(int[] arr){

        int[] reversed = new int[arr.length];

        int index = arr.length-1;
        int indexNew = 0;

        for ( int each : arr) {
            reversed[indexNew++] = arr[index--];
        }
        return reversed;
    }

    //reverses double array , returns double array
    public static double[] reverseArr(double[] arr){

        double[] reversed = new double[arr.length];

        int index = arr.length-1;
        int indexNew = 0;

        for ( double each : arr) {
            reversed[indexNew++] = arr[index--];
        }
        return reversed;
    }

    //reverses char array , returns char array
    public static char[] reverseArr(char[] arr){

        char[] reversed = new char[arr.length];

        int index = arr.length-1;
        int indexNew = 0;

        for ( char each : arr) {
            reversed[indexNew++] = arr[index--];
        }
        return reversed;
    }

    //reverses double array , returns double array
    public static String[] reverseArr(String[] arr){

        String[] reversed = new String[arr.length];

        int index = arr.length-1;
        int indexNew = 0;

        for ( String each : arr) {
            reversed[indexNew++] = arr[index--];
        }
        return reversed;
    }
}
