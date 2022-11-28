package day15_PracticeTasks;

public class Task1_SumEvenNumbers {

    /*
    1. Write a program that can return the sum of even numbers between 1 to 100
     */

    public static void main(String[] args) {

        int result = 0;

        for (int i = 0; i <= 100; i += 2) {

            result += i;

        }
        System.out.println(result);
    }

}
