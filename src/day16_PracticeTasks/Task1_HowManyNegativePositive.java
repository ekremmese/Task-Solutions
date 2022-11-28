package day16_PracticeTasks;

import java.util.Scanner;

public class Task1_HowManyNegativePositive {

    /*
    1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //int user = 0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {

            int number = input.nextInt();

            if(number > 0) {
                positive++;
            }
            if (number<0) {
                negative++;
            }

        }

        System.out.println(positive + " positive and " + negative + " negative");

    }
}
