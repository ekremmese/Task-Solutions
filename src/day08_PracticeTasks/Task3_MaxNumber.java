package day08_PracticeTasks;

public class Task3_MaxNumber {
    public static void main(String[] args) {

        /*
        3. Write a program that can print the maximum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number
         */

        int n1 = 200;
        int n2 = 100;

        if (n1 > n2) {
            System.out.println(n1 + " is maxiumum");
        }
        if (n2 > n1) {
            System.out.println(n2 + " is maximum");
        }
        if (n1 == n2) {
            System.out.println("Both numbers are equal");
        }

    }
}
