package day13_PracticeTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2_LongestString {

    public static void main(String[] args) {
        /*
        2. write a program that asks user to enter two strings, and print out the longest string
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter first text: ");
        String sentence1 = scan.nextLine();

        System.out.println("Please enter second text: ");
        String sentence2 = scan.nextLine();

        int sentencelength1 = sentence1.length();
        int sentencelength2 = sentence2.length();

        if (sentencelength1 > sentencelength2) {
            System.out.println(sentence1);
        } else if (sentencelength1 < sentencelength2) {
            System.out.println(sentence2);
        } else {
            System.out.println("Sentences have equal number of characters. ");
        }


    }
}
