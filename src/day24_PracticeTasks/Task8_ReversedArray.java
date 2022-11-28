package day24_PracticeTasks;

import java.util.Arrays;

public class Task8_ReversedArray {

    /*
    8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
     */

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        reversedArray(arr);

    }


    public static void reversedArray(int[] arr) {

        int[] temp = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; j++, i--) {

            temp[j] = arr[i];

        }

        System.out.println(Arrays.toString(temp));

    }


}
