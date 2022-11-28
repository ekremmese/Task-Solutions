package day24_PracticeTasks;

import java.util.Arrays;

public class Task10_removeElement {

    /*
    10. create a method named removeElement that passes one integer array and one integer, the method removes the integer index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
     */

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60}; // arr[]
        int index = 2;

        removeElement(array, index);
    }

    public static void removeElement(int[] arr, int indexNumber) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < indexNumber; i++) {
            newArr[i] = arr[i];
        }
        for (int i = indexNumber + 1, j = indexNumber ; i < arr.length ; j++, i++) {
            newArr[j] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));

        // This can be done with copyRangeOf method , try it
    }


}
