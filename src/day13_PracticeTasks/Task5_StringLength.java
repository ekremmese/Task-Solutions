package day13_PracticeTasks;

import java.util.Scanner;

public class Task5_StringLength {

    public static void main(String[] args) {

        /*
        5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a text: ");
        String text = input.nextLine();

        int length = text.length();

        //String result = "";

        if (length == 0) {
            System.out.println("String is empty.");
        }
        if (length > 3) {

            System.out.println(text.substring(length - 3));


        }
        if (length <= 3) {
            System.out.println(text);
        }

        input.close();

    }
}
// OLMADI

