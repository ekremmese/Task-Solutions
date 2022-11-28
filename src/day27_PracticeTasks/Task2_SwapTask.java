package day27_PracticeTasks;

import java.util.Arrays;

public class Task2_SwapTask {
    /*
    2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method
	swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array
     */

    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};
        arr = swap(arr,3,1);
        System.out.println(Arrays.toString(arr));

    }

    private static int[] swap(int[] array, int index1, int index2) {

        if (index1<0 || index1> array.length-1 || index2<0 || index2>= array.length ) {
            System.out.println("Invalid index number!");
            System.exit(0);
        }
       int first =  array[index1];
       int second = array[index2];
       array [index2] = first;
       array[index1] = second;

       return array;


    }
}
