package day17_PracticeTasks;

import java.util.Scanner;

public class Task3_TwoNumberAndMathOperator {

    /*
    3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 1st number: ");
        int num1 = input.nextInt();

        System.out.println("Please enter 2nd number: ");
        int num2 = input.nextInt();

        System.out.println("Please enter math operator: ");
        char ch = input.next().charAt(0);

        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.out.println("Invalid math operator. Please re enter math operator: ");
            ch = input.next().charAt(0);
        }

        if (ch=='+') {
            System.out.println(num1 + num2);
        }
        if (ch=='-') {
            System.out.println(num1 - num2);
        }
        if (ch=='*') {
            System.out.println(num1 * num2);
        }
        if (ch=='/') {
            System.out.println(num1 / num2);
        }

        input.close();
    }
}
