package day13_PracticeTasks;

import java.util.Scanner;

public class Task3_FirstAndLastCharacters {
    /*

    3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String sentence = input.next();

        int length = sentence.length();

        char first = sentence.charAt(0);
        char last = sentence.charAt(length - 1);

        if (first == last) {
            System.out.println("same");
        } else {
            System.out.println("Not same");
        }

        input.close();


    }
}
