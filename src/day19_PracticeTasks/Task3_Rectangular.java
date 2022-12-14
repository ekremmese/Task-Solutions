package day19_PracticeTasks;

import java.util.Scanner;

public class Task3_Rectangular {

    /*
    3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the length of the Rectangle:");
            double length = input.nextDouble();

            while (length < 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("Enter the width of the Rectangle:");
            double width = input.nextDouble();

            while (width < 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            double area = width * length;
            double perimeter = 2 * (width + length);

            System.out.println("Area of rectangle: " + area);
            System.out.println("Perimeter of rectangle: " + perimeter);

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.err.println("Invalid entry. Please re-enter. Would you like to calculate another Rectangle?");
                answer = input.next().toLowerCase();

            }

            if (answer.equals("no")) {
                System.out.println("Thanks for using calculator");
                break;
            }

        }


        input.close();

    }
}
