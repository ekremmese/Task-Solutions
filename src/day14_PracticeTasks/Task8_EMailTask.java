package day14_PracticeTasks;

import java.util.Scanner;

public class Task8_EMailTask {

    public static void main(String[] args) {

        /*
        8. Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your email: ");
        String email = scan.next();

        int indexOfUnderScore = email.indexOf("_"),
                indexOfAt = email.indexOf("@"),
                indefOfDot = email.indexOf(".");


        String firstName = email.substring(0, indexOfUnderScore);
        String lastName = email.substring(indexOfUnderScore + 1, indexOfAt);
        String domainName = email.substring(indexOfAt + 1, indefOfDot);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domainName = " + domainName);

        scan.close();

    }
}
