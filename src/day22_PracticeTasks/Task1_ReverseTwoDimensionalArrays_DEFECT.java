package day22_PracticeTasks;

import java.util.Arrays;

public class Task1_ReverseTwoDimensionalArrays_DEFECT {
    /*
    1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
     */

    public static void main(String[] args) {

        int[][] arr = {{0,1, 2, 3,4 }, {5, 6,7}}; // length :2 indexes : 0   1

        int[][] reversed= new int[arr.length][];

       for (int i = arr.length-1,j=0; i >=0 ; i--,j++) {
           //reversed [j] = arr [i];
           reversed[j] = new int[arr[i].length];
           for (int k = arr[i].length-1, m=0; k >=0 ; m++,k--) {
               reversed [j][m] =arr [i][k]     ;
           }

        }

        System.out.println(Arrays.deepToString(reversed));


    }


/*

//Nevzat's Code:


    public static void main(String[] args) {

        int[][] array = { {1,2,3}, {4,5,6}};

        int[][] reverse = new int[array.length][];

        for (int i = array.length - 1,k = 0; i >= 0; i--,k++) {

            reverse[k] = new int[array[i].length];

            for (int j = array[i].length - 1,l = 0; j >= 0; j--,l++) {

                reverse[k][l] = array[i][j];

            }

        }

        System.out.println(Arrays.deepToString(reverse));
// OUTPUT: [[6, 5, 4], [3, 2, 1]]
    }*/
}
