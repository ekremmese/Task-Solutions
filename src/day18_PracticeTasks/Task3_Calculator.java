package day18_PracticeTasks;

import java.util.Scanner;

public class Task3_Calculator {
    /*
    3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provide
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int result = 0;

            System.out.println("Please enter 1st number: ");
            int num1 = input.nextInt();

            System.out.println("Please enter math operator: ");
            char ch = input.next().charAt(0);

            while ( !(  ch == '+' || ch == '*' || ch == '-' || ch == '/')) {
                System.err.println("Invalid math operator. Please enter a valid math operator.");
                ch = input.next().charAt(0);
            }

            System.out.println("Please enter 2nd number: ");
            int num2 = input.nextInt();

            switch (ch) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            System.out.println(result);

            System.out.println("Do you want to continue");
            String answer = input.next();

            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }

        }





        input.close();
    }
}
