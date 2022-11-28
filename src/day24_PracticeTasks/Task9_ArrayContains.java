package day24_PracticeTasks;

public class Task9_ArrayContains {

    /*
    9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 5, 6, 7};
        int num = 10;

        arrayContains(arr,num);

    }

    public static void arrayContains(int[] arr, int num) {

        int counter = 0;
        for (int each : arr) {

            if (each == num) {
                counter++;
            }

        }

        if (counter >= 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
