package day12_PracticeYasks;

import java.util.Scanner;

public class Task1_3_SalaryCalculator {

    /*
    3. SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your hourly Rate: ");
        double hourlyRate = input.nextDouble();

        System.out.println("How many hours do you work in a week? ");
        int workingHours = input.nextInt();

        System.out.println("What is state tax rate in your state?");
        double stateTaxRate = input.nextDouble();

        System.out.println("What is federal tax rate in your region= ");
        double federalTaxRate = input.nextDouble();

        double salary = hourlyRate * workingHours * 52;
        double stateTax = stateTaxRate * salary/100;
        double federalTax = federalTaxRate * salary/100;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - totalTax;

        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("workingHours = " + workingHours);
        System.out.println("netIncome = " + netIncome);
    }
}
