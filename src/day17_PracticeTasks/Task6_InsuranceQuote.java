package day17_PracticeTasks;

import java.util.Scanner;

public class Task6_InsuranceQuote {
    /* 2:05
    6. Create a class called InsuranceQuote, write a program that can calculate the insurance cost of a person based on the following info:
    		1. Ask the user to enter your name
    		2. Ask the user to enter your gender
    			(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			3. Ask the user if he/she is married(Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			4. Ask user to enter your age
					(age can not be negative or greater than 120)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			5. Ask user to enter how many miles he/she drives in a day
					(mileage can not be negative or less than 5)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)
			6. Ask the user if he/she wants full coverage or liability insurance?

			7. Ask if he/she had any accidents or claims in past 5 years (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

			8. Ask the user if his/her car has an anti-theft device (Yes/No)
					(if user enters invalid entry, ask the user to re-enter until user provides a valid entry)

		Calculate the price of the insurance and display all the info of the user

			Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double  insuranceCost = 0;

        System.out.println("Please enter your name: ");
        String name = input.next();

        System.out.println("Please enter your gender: ");
        String gender = input.next().toLowerCase();

        while ( !(gender.equals("male") || gender.equals("female"))) {
            System.err.println("Invalid entry! Please re_enter. Please enter your gender: ");
            gender = input.next();
        }

        System.out.println("Are you married? ");
        String married = input.next().toLowerCase();

        while ( !(married.equals("yes") || married.equals("no"))) {
            System.err.println("Invalid entry! Please re_enter. Are you married ");
            married = input.next().toLowerCase();
        }

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        while ( !( age > 0 && age <=120)) {
            System.err.println("Invalid entry! Please re_enter. Please enter your age: ");
            age = input.nextInt();
        }

        System.out.println("how many miles do you drive in a day? ");
        int miles = input.nextInt();

        while (!(miles >= 5)) {
            System.err.println("Invalid entry. Please re-enter. how many miles do you drive in a day?");
            miles = input.nextInt();
        }

        input.nextLine();

        System.out.println("Do you want full coverage or liability insurance?");
        String fullOrLiability = input.nextLine().toLowerCase();

        while (!(fullOrLiability.equals("full coverage") || fullOrLiability.equals("liability"))) {
            System.err.println("Invalid entry. Please re-enter. Do you want full coverage or liability insurance? ");
            fullOrLiability = input.nextLine().toLowerCase();
        }

        System.out.println("Did you have any accident for the last few years?");
        String accident = input.next().toLowerCase();

        while (!(accident.equals("yes") || accident.equals("no"))) {
            System.err.println("Invalid entry. Please re-enter. Did you have any accident for the last few years? ");
            accident = input.next().toLowerCase();
        }


        System.out.println("Does your car has an anti-theft device? ");
        String antiTheftDevice = input.next().toLowerCase();

        while ( !(antiTheftDevice.equals("yes") || antiTheftDevice.equals("no"))) {
            System.err.println("Invalid entry. Please re-enter.Does your car has an anti-theft device? ");
            antiTheftDevice = input.next().toLowerCase();
        }

        /*
        Insurance Quote calculation:
				starting prices for liability:
					age < 25 ===> 90
					age >= 25 ==> 50

					miles <= 10 ====> $10
				    miles > 10 and miles <= 50 ==> $30
				    miles > 50 ===>  $50

				starting prices for full coverage:
					age < 25 ===> 160
					age >= 25 ==> 120

					miles <= 10 ====> $20
				    miles > 10 and miles <= 50 ==> $40
				    miles > 50 ===>  $70


			    If the car has anti-theft device ==> 5% discount
			    If he/she had any accidents or claims in past 5 years ===> 15% extra charge
			    If he/she never had any accidents or claims in past 5 years ==> 10% discount
			    If he/she is married ==> 5% discount
         */


        if (fullOrLiability.equals("liability")) {

            if ( age <25 ) {
                insuranceCost +=90;
            } else {
                insuranceCost +=50;
            }

            if (miles > 50 ){
                insuranceCost +=50;
            } else if (miles >10 && miles <=50) {
                insuranceCost +=30;
            } else {
                insuranceCost+= 10;
            }
        } else {

            if ( age <25 ) {
                insuranceCost +=160;
            } else {
                insuranceCost +=120;
            }

            if (miles > 50 ){
                insuranceCost +=70;
            } else if (miles >10 && miles <=50) {
                insuranceCost +=40;
            } else {
                insuranceCost+= 20;
            }

        }


        if (antiTheftDevice.equals("yes")) {
            insuranceCost *= 0.95;
        }

        if(accident.equals("yes")) {
            insuranceCost *= 1.15;
        } else {
            insuranceCost *= 0.90;
        }

        if(married.equals("yes")) {
            insuranceCost *= 0.95;
        }

        System.out.println(insuranceCost);


        input.close();


    }
}
