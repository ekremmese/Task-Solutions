package day12_PracticeYasks;

import java.util.Scanner;

public class Task4_MilesToKilometers {

    public static void main(String[] args) {

        /*

        4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter miles: ");
        int miles = input.nextInt();

        double km = miles * 1.609;

        System.out.println(miles + " miles equal to " + km + " kilometers ");


    }
}
