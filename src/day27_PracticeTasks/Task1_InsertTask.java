package day27_PracticeTasks;

import java.util.Arrays;

public class Task1_InsertTask {
    /*
    1. Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index,
		integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

     */

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int arr1[] = insert(arr,2,100);

        System.out.println(Arrays.toString(arr1));
    }

    private static int[] insert(int array[],int index, int element) {

        if ( index > array.length-1){
            System.out.println("Invalid index number");
            System.exit(0);
        }
        int[] result = new int[array.length+1];
        int i = 0;
        for ( int each : array){
            if(i == index)
                continue;
            result[i++] = each;

        }
        result[index] = element;

        for (int j = index+1; j <result.length ; j++) {
            result[j] = array[j-1];
        }

        return result;


    }


}
