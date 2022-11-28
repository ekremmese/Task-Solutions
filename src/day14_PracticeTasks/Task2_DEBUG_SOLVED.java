package day14_PracticeTasks;

import java.util.Scanner;

public class Task2_DEBUG_SOLVED {

    public static void main(String[] args) {

        /*
        2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
        really
        012345
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = input.next();
        String ly = "ly";
        int length = word.length();
        boolean a =  word.substring(length - 2) == ly;

        System.out.println(length);
        System.out.println(word.substring(length - 2));
        if (a) {
            System.out.println("Really");
        } if (!a) {                         // WHY HERE ITS NOT WORKING IF IT IS ELSE ????
            System.out.println("Never mind");
        }


    }
}
