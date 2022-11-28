package day25_PracticeTasks;

import java.util.Arrays;

public class Task2_MaxNumberOfArray {

    /*
    Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
     */

    public static void main(String[] args) {

        int[] arr1 = {1, 34, 54, 0, 51};

        int max = maxElementOfArray(arr1);
        System.out.println("max = " + max);

    }

    //finds the maximum of an int array
    public static int maxElementOfArray(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //finds the maximum of an double array
    public static double maxElementOfArray(double[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //finds the maximum of an long array
    public static long maxElementOfArray(long[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //finds the maximum of an short array
    public static short maxElementOfArray(short[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //finds the maximum of an float array
    public static float maxElementOfArray(float[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //finds the maximum of an byte array
    public static byte maxElementOfArray(byte[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    
}
