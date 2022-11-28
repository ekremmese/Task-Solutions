package day13_PracticeTasks;

import java.util.Scanner;

public class Task1_1_Reverse {

    /*
    1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word with 5 characters: ");
        String word = input.next();

        int length = word.length();
        String result;
      if (length>5) {
            result = "Too long!";
        } else if (length<5) {
            result = "Too short";
        } else {
           result = ("" + word.charAt(4)) + ("" + word.charAt(3)) + ("" + word.charAt(2)) + ("" + word.charAt(1)) + ("" + word.charAt(0));

        }

        System.out.println(result);





        input.close();


    }
}
