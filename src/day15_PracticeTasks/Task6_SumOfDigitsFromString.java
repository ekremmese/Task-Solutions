package day15_PracticeTasks;

import java.sql.SQLOutput;

public class Task6_SumOfDigitsFromString {

    /*
     6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...
     */

    public static void main(String[] args) {

        String input = "1AB5C7";
        int length = input.length();
        int sum = 0;
        for (int i = 0; i <= length-1; i++) {

            int ch = input.charAt(i);

            if (ch >= '0' && ch <='9'){
                int a = ch;
                sum += (a-48);

            }

        }

        System.out.println(sum);

    }


}
