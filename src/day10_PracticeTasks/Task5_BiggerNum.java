package day10_PracticeTasks;

public class Task5_BiggerNum {

    public static void main(String[] args) {

        /*

        Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
         */
        int n1 = 15;
        int n2 = 16;
        int n3 = 15;

        String biggerNumber = (n1!=n2 && n2!=n3) ? (n1 > n2 && n1 > n3) ? "n1 is the biggest number" : (n2 > n1 && n2 > n3)  ? "n2 is the biggest number" : "n3 is the biggest number" : "All numbers are equal";
        System.out.println(biggerNumber);


    }
}
// ?  :  ?  : (n3>n1 && n3>n3) ? ""