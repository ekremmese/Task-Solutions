package day13_PracticeTasks;

import java.util.Scanner;

public class Task7_CheckWords {

    public static void main(String[] args) {

        /*
        7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the 1st word: ");
        String first = input.next();

        System.out.println("Please enter the 2nd word: ");
        String second = input.next();

        System.out.println("Please enter the 3rd word: ");
        String third = input.next();

        int a = first.length();
        int b = second.length();
        int c = third.length();

        String result = "";

        if ( a == b && b == c ) {
             result = "All words are same length";
        } else if ( a != b && b!= c) {
            result = "All different length";
        } else {
            result = "Not same nor different lengths";
        }

        System.out.println("result = " + result);

        input.close();
    }
}
