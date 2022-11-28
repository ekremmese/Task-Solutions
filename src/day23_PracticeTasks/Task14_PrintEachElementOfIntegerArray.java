package day23_PracticeTasks;

public class Task14_PrintEachElementOfIntegerArray {
    /*
    14. create a method named printEachElement that can print each elements of an integer array
     */
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,7};
      printEachElement(arr);
    }

    public static void printEachElement (int[] arr){

        int[] arr1 = arr;

        for (int each : arr1) {

            System.out.println(each);

        }
    }
}
