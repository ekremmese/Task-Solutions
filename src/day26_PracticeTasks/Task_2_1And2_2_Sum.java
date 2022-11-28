package day26_PracticeTasks;

public class Task_2_1And2_2_Sum {
    /*
    1. Create a class called MathUtility under the utility package:

			2.1 Create a method that can return the sum of two integers
			2.2 Create a method that can return the sum of two decimal numbers


     */

    public static void main(String[] args) {

        System.out.println("sum(2,5) = " + sum(2, 5));

    }

    public static int sum(int num1, int num2) {
        return num1+num2;
    }

    public static double sum(double num1, double num2) {
        return num1+num2;
    }
}
