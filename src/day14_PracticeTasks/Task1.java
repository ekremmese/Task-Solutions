package day14_PracticeTasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        /*
        1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your 1st word: ");
        String firstWord = input.next();

        System.out.println("Please enter your 2nd word: ");
        String secondWord = input.next();

        System.out.println(firstWord.substring(1) + secondWord.substring(1));
        input.close();
    }
}
