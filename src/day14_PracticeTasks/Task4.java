package day14_PracticeTasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        /*
        4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String wordOne = input.next();

        System.out.println("Please enter another word: ");
        String wordTwo = input.next();

        if (wordOne.charAt(wordOne.length() - 1) == wordTwo.charAt(0)) {
            System.out.println(wordOne.substring(0, wordOne.length()) + wordTwo.substring(1));
        } else {
            System.out.println(wordOne + wordTwo);
        }
        input.close();
    }
}
