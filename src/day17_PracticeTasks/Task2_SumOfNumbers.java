package day17_PracticeTasks;

import java.util.Scanner;

public class Task2_SumOfNumbers {

    /*
    2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {

            System.out.println("Please enter a number: ");
            int number = input.nextInt();

            sum += number;

            if ( number < 0)  {
                break;
            }



        }

        System.out.println(sum);


input.close();

    }




}
