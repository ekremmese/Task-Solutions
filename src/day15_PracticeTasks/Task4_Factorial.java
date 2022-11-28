package day15_PracticeTasks;

public class Task4_Factorial {

    public static void main(String[] args) {

        /*
        4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */

        int number = 6;
        int result =1;
        for (int i = number; i >= 1; i--) {
            result *= i;
        }

        System.out.println(result);
    }
}
