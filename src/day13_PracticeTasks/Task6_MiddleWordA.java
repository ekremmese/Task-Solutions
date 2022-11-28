package day13_PracticeTasks;

import java.util.Scanner;

public class Task6_MiddleWordA {

    public static void main(String[] args) {

        /*
        6. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'.
In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 letters world: ");
        String word = input.next();

        int a = word.length();
        char second = word.charAt(1);
        boolean secondA = second == 'a';

        if (a == 3) {
            if (secondA) {
                System.out.println("coold word");
            } else {
                System.out.println("Okay word");
            }


        } else if (a > 3) {
            System.out.println("Word is too long");
        } else  {
            System.out.println("Word is too short");
        }

// HOW CAN I MAKE AVOID INPUTMISSMATCH ERROR IF THE USER ENTERS ONE CHARACHTER (CHAR) ONLY   ?

    }
}
