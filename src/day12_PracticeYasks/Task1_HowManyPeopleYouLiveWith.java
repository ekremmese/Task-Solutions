package day12_PracticeYasks;

import java.util.Scanner;

public class Task1_HowManyPeopleYouLiveWith {

    public static void main(String[] args) {

        /*
        1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"

         */

        Scanner input = new Scanner(System.in);

        System.out.println("How many people you live with? ");

        int numberOfPeople = input.nextInt();

        String result;

        result = (numberOfPeople < 3) ? "Live with less than 3 people" : (numberOfPeople >= 3 && numberOfPeople <= 6) ? "Live with 3- 6 people"
                :  "Live with more than 6 people"  ;

        System.out.println("result = " + result);

    }
}
