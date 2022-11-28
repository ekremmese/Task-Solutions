package day24_PracticeTasks;

import java.util.Arrays;

public class Task6_AddElement {
    /*
    6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:   //  0 1 2
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

     */

    public static void main(String[] args) {

        int arr[] = {1,2,3};
        int num = 4;
        int num2=7;

        addElement(arr,num, num2);

    }

    public static void addElement(int[] arr, int number, int number2){

        int[] arr1 = new int[arr.length+2]; //

        for (int i = 0; i < arr.length; i++) {  //  int[] arr1 = {1 ,2, 3, 0 }
            arr1[i] = arr[i]   ;
        }
        arr1[arr.length] = number; // int[] arr1 = {1 ,2, 3, number }
        arr1[arr.length+1] = number2; // int[] arr1 = {1 ,2, 3, number,  number2 }

        System.out.println(Arrays.toString(arr1));



    }


}
