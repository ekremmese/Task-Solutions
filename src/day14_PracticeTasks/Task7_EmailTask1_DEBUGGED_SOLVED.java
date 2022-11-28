package day14_PracticeTasks;

import java.util.Scanner;

public class Task7_EmailTask1_DEBUGGED_SOLVED {

    public static void main(String[] args) {
        /*
        7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your email: ");
        String email = scan.next();
        //String email = "ekrem_mese1@gmail.com";

        int indexUnderScore = email.indexOf("_");
        int lengthOfEmail = email.length();
        int indexAt = email.indexOf("@");



        String firstNameOfEmail = email.substring(0, indexUnderScore);
        String lastNameOfEmail = email.substring(indexUnderScore+1, indexAt);
        String restOfEmail = email.substring(indexAt +1);
        String result = "";

        if ( indexUnderScore >= 0) {
            result = lastNameOfEmail + "_" + firstNameOfEmail + "@" + restOfEmail;
        }


        System.out.println(result);

        scan.close();


/*
        String word = "sdfsdfdsfds";
        int index = word.indexOf("_");

        System.out.println(index);

 */


    }
}
