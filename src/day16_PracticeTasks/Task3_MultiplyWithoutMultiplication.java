package day16_PracticeTasks;

import java.util.Scanner;

public class Task3_MultiplyWithoutMultiplication {

    /*
    3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 0;
        String message ="";


        for (int i = 1; i <= num1 ; i++) {
            if (num1 >= 0 && num2 >= 0) {
                result += num2;
            } else {
                message = "Invalid";
            }
        }

        System.out.println(result);
        System.out.println(message);
       /*

        */



    }
}
