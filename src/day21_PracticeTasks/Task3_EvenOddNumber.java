package day21_PracticeTasks;

public class Task3_EvenOddNumber {
    /*
    2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
     */

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 0, 4, 8, 9};
        int even = 0;
        int odd = 0;

        for (int each : arr) {

            if (each % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }

        System.out.println(even);
        System.out.println(odd);

    }
}
