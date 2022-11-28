package day13_PracticeTasks;

import java.util.Scanner;

public class Task1_3_Travel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a valid passport? ");
        String validPassportYesOrNo = input.next().toLowerCase();

        if (validPassportYesOrNo.equals("yes")) {

            input.nextLine();

            System.out.println("Which country are you travelling to? ");
            String country = input.nextLine();

            System.out.println("How many bags you will take with you? ");
            byte bags = input.nextByte();

            System.out.println("How many people you will travel with? ");
            short numberOfPeople = input.nextShort();

            input.nextLine();

            System.out.println("Please enter the name of people you are travelling with? ");
            String  travellers = input.nextLine() ;

            int reduce;

            if (numberOfPeople>3) {
                reduce = 3*100;
            } else {
                reduce = numberOfPeople*100;
            }

            System.out.println("Your ticket is booked to " +  country +  ". We have charged extra for the " + bags + " bags but you are travelling with " + travellers + " so we are giving a discount. Your " +
                    "total cost is " + (1000+ bags*50 -reduce) );

        } else {

            System.out.println("When your passport expired? ");
            int passportExpiryYear = input.nextInt();

            System.out.println("Which country are you travelling to? ");
            String country = input.next();

            System.out.println("Are you planning to travel next year? ");
            String nextYear = input.next();

            int reduce = 0;

            if (nextYear.equals("yes")) {
                reduce += 100;
            } else {
                reduce -= 50;
            }

            int cost = (2022 - passportExpiryYear) * 75 + reduce + 200;

            System.out.println("Looks like your password has been expired for " + (2022 -passportExpiryYear) + " years. But not to worry we will get it ready for you to " + country + " Your total cost came out to " + cost );
        }

    }
}


/*
. Create a class calledTravel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags
            		but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to
        			travel to $allCountries. Your total cost has come out to $costAmount.
 */