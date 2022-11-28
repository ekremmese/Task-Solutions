package day12_PracticeYasks;

import java.util.Scanner;

public class Task3_CentsToDolars {

    public static void main(String[] args) {

        /*
        3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how many cents you have: ");
        int cents = input.nextInt();

        int dollars = cents/100;
        int remain = cents%100;

        System.out.println(cents + "equals to: " + dollars + " dollars " + " and " + remain + " cents.");
    }
}
