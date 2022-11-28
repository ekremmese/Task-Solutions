package day14_PracticeTasks;

import java.util.Scanner;

public class Task6_AccountNumber {

    public static void main(String[] args) {

        /*
         6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your account number: ");
        String accountNumber = scan.next();

        char firsCharacter = accountNumber.charAt(0);
        int length = accountNumber.length();
        String result = "";

        if ( firsCharacter == '2' || firsCharacter == '5') {
            if (firsCharacter == '2') {
                if (length == 7) {
                    result = "Valid a ";
                } else {
                    result = "Invalid b";
                }
            } else {
                if (length == 10) {
                    result = "Valid c";
                } else {
                    result = "Invalid d";
                }

            }
        } else {
            result = "Invalid e";
        }


        System.out.println(result);



        /*
        if (firsCharacter == '2') {
            if (length != 7) {
                System.out.println("Invalid account number.");
            } else {
                System.out.println("Valid account number.");
            }
        }
        if (firsCharacter == '5') {
            if (length != 10) {
                System.out.println("Invalid account number.");
            } else {
                System.out.println("Valid account number.");
            }
        }
        if (firsCharacter != '2' || firsCharacter != '5') {

            System.out.println("Invalid account number. ");
        }

         */


        scan.close();
    }
}
