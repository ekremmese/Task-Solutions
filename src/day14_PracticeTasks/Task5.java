package day14_PracticeTasks;

import java.util.Scanner;

public class Task5 {

    /*

    5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word:");
        String word = input.next();

        char wordFirstLetter = word.charAt(0);

        boolean a = wordFirstLetter >= 'a' && wordFirstLetter <= 'z';
        boolean b = wordFirstLetter >= 'A' && wordFirstLetter <= 'Z';
        boolean c = wordFirstLetter >= '0' && wordFirstLetter <= '9';
        boolean d = !a && !b && !c;

        String result;

        if (c) {
            result = "First character is digit. ";
        } else if (b) {
            result = word.toLowerCase();
        } else if (a) {
            result = word.toUpperCase();
        } else {
            result = "First character is a special character. ";
        }

        System.out.println(result);

        input.close();

    }
}
