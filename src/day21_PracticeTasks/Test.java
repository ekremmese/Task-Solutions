package day21_PracticeTasks;

public class Test {

    public static void main (String[] args){

	/*
	3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
          */


        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};

        int[] arr3 = new int[arr1.length+arr2.length];  // {1,2,3,4,5,0,0,0,0,0}

        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
            //5      6      7        8                 9
        for (int i = arr1.length, j=0 ; i < arr1.length + arr2.length; i++, j++){
            arr3[i] = arr2[j];
        }

        int counter = 0;
        String result ="";

        for ( int i = 0; i<arr3.length; i++) {

            for (int j = 0; j < arr3.length; i++){
                if (arr3[i] == arr3[j]) {
                    counter++;
                }
        }
            if (counter == 2) {
                result += arr3[i];
            }

        }

        System.out.print(result);





    }
}
