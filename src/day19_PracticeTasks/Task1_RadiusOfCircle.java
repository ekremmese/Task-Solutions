package day19_PracticeTasks;

import java.util.Scanner;

public class Task1_RadiusOfCircle {
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"
2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double area = 0;
        double perimeter = 0;

        while ( true ) {

            System.out.println("Enter the radius of the circle.");
            int radius = input.nextInt();

            while (!(radius>0)) {
                System.err.println("Invalid Entry for the radius of the circle.");
                System.exit(0);

            }

            area = 3.14 * radius * radius;
            perimeter = 2 * 3.14 * radius;

            System.out.println(area);
            System.out.println(perimeter);

            System.out.println("Would you like to calculate another circle?");
            String answer = input.next().toLowerCase();

            while(!(answer.contains("yes") || answer.contains("no"))) {
                System.out.println("Invalid. Please re-enter.");
                answer = input.next().toLowerCase();
            }

            if ( answer.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }

        }


        input.close();
    }
}
