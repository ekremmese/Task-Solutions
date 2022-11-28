package day24_PracticeTasks;

public class Task5_FrequencyArray {
    /*
     5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

     */

    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2,2};
        frequencyArray(array, 2);

    }

    public static void frequencyArray(int[] arr1, int number){

        int counter = 0;

        for ( int each : arr1  ) {
            if ( each == number ) {
                counter++;
            }
        }

        System.out.println(counter);

    }

}
