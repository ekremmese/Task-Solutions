package day15_PracticeTasks;

public class Task3_SumOfNumbers {

    public static void main(String[] args) {

        /*
        3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

         */

        int number = 100;
        int result = 0;
        for (int i = 0; i <= number; i++) {

            result +=i;

        }

        System.out.println(result);

    }


}
