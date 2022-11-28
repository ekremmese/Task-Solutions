package day24_PracticeTasks;

import java.util.Arrays;

public class Task7_MergeArrays {

    /*
    7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}

     */

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        mergeArrays(arr1,arr2);

    }

    public static void mergeArrays(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        for (int i = arr1.length , j=0; i < arr1.length + arr2.length ; j++, i++) {
            arr[i] = arr2[j];
        }

        System.out.println(Arrays.toString(arr));
    }


}
