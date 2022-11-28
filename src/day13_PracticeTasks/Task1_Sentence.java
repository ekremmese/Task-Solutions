package day13_PracticeTasks;

import java.util.Scanner;

public class Task1_Sentence {

    public static void main(String[] args) {

        /*
        1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your sentence: ");
        String sentence = input.nextLine();

        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length() - 1);

        System.out.println(first);
        System.out.println(last);


    }
}
