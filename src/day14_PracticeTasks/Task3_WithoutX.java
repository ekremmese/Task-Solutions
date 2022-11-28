package day14_PracticeTasks;

import java.util.Scanner;

public class Task3_WithoutX {

    public static void main(String[] args) {

        /*
         3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = input.next();

        if ( word.charAt(0) == 'x') {
            System.out.println(word.substring(1));
        }

        input.close();
    }
}
