package day25_PracticeTasks;

import java.util.Arrays;

public class Task3_MinNumberOfArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 34, - 54, 0, 51};

        int min = minElementOfArray(arr1);
        System.out.println("min = " + min);

    }

    public static int minElementOfArray(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //finds the maximum of an double array
    public static double minElementOfArray(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //finds the minimum of an long array
    public static long minElementOfArray(long[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //finds the minimum of an short array
    public static short minElementOfArray(short[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //finds the minimum of an float array
    public static float minElementOfArray(float[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    //finds the minimum of an byte array
    public static byte minElementOfArray(byte[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }


}
