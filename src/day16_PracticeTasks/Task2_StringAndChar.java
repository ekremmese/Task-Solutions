package day16_PracticeTasks;

import java.util.Scanner;

public class Task2_StringAndChar {

    /*
    2. Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = input.next();
        String ch = input.next();
        //char ch = 'x';
        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            char ch1 = word.charAt(i); // 4. index 'x'

            if (ch.charAt(0) == ch1) {

                ++count;
            }

        }

        System.out.println(count);



    }
}
