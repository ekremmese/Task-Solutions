package day13_PracticeTasks;

import java.util.Scanner;

public class Task4_InitialOfUser {

    /*

    4. write a program that can return the initials of the user
            ex:
                cybertek
                school
            output:
                C.S
        Note: Pay attention to the example output

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first name: ");
        String firstName = input.next();

        System.out.println("Please enter last name: ");
        String lastName = input.next();

        char first = firstName.charAt(0);
        char last = lastName.charAt(0);

        System.out.println(first + "." + last);


    }
}
