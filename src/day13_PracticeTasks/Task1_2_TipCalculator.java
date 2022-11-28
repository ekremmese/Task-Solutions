package day13_PracticeTasks;

import java.util.Scanner;

public class Task1_2_TipCalculator {

    public static void main(String[] args) {

        /*
        . Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total
	to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75                    58:43
			Tip per person: 29.75

	HINT: you will need to use .equals() method
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No)? ");
        String yesOrNo = input.next().toLowerCase();

        System.out.println("Please enter the number of people: ");
        int numberOfPeople = input.nextInt();

        System.out.println("Enter the check amount: ");
        double checkAmount = input.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)? ");
        String service = input.next();

        double tipRate = (service.equals("excellent")) ? 0.25 : (service.equals("great")) ? 0.20 :
                (service.equals("good")) ? 0.15 : (service.equals("fair")) ? 0.10 : 0.05;

        double totalTip = tipRate * checkAmount;

        System.out.println("Number of people entered: " + numberOfPeople);
        System.out.println("Total to pay: " + checkAmount);
        System.out.println("Total tip: " + totalTip);

        if (yesOrNo.equals("yes")) {
            System.out.println("Total per person: " + checkAmount / numberOfPeople);
            System.out.println("Tip per person: " + totalTip / numberOfPeople);
        }

        input.close();


    }
}
