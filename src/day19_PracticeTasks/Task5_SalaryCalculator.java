package day19_PracticeTasks;

import java.util.Scanner;

public class Task5_SalaryCalculator {

    /*
    5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("How much you make an hour?");
            double hourlyRate = input.nextDouble();

            while (hourlyRate <= 0) {

                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);

            }

            System.out.println("How many hours do you work per week?");
            double hoursPerWeek = input.nextDouble();

            while (hoursPerWeek < 1 || hoursPerWeek > 144) {

                System.err.println("Invalid Entry for Weekl Hours");
                System.exit(0);

            }

            System.out.println("Enter your state tax rate?");
            double stateTax = input.nextDouble();

            while (stateTax < 0 || stateTax > 10) {

                System.err.println("Invalid Entry for stateTax");
                System.exit(0);

            }

            double grossSalary = hourlyRate * hoursPerWeek * 52;
            double federalTax = grossSalary * 0.26;
            double stateTaxAmount = stateTax * hourlyRate;
            double totalTax = federalTax + stateTaxAmount;
            double netIncome = grossSalary - totalTax;

            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTax = " + federalTax);
            System.out.println("stateTaxAmount = " + stateTaxAmount);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);

            System.out.println("Would you like to continue?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry!");
                System.exit(0);
            }

            if (answer.equals("no")) {
                System.out.println("Thanks using Salary Calculator.");
                break;
            }


        }


        input.close();

    }
}
