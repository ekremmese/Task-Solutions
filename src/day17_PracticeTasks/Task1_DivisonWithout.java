package day17_PracticeTasks;

public class Task1_DivisonWithout {

    public static void main(String[] args) {

        /*
        	1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
         */


        int number = 30;
        int divider = 15;
        int counter = 0;

        while (number>=divider) {
            number -= divider;
            counter++;
        }

        System.out.println("Division equals " + counter + " with a remainder " + number);


    }

}
