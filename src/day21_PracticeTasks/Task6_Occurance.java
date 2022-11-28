package day21_PracticeTasks;

import java.util.Arrays;

public class Task6_Occurance {

    /*
    6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

     */
    public static void main(String[] args) {

        String[] sentence = {"Java", "Java", "Python", "C#", "Python", "Java"};

        int counterJava = 0;
        int counterPython = 0;

        for (String each : sentence) {

            if (each.equalsIgnoreCase("java")) {
                counterJava++;
            }
            if (each.equalsIgnoreCase("python")) {
                counterPython++;
            }

        }

        System.out.println(counterJava);
        System.out.println(counterPython);


    }


}
