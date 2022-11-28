package day23_PracticeTasks;

public class Task2_EvenNumbers {

    /*
    2. create a method that can print even numbers between 1~100 in a same line saperated by space
     */
    public static void main(String[] args){

        evenNumbers();

    }

    public static void evenNumbers(){

        for (int i = 0; i <= 100; i+=2) {
            System.out.print(i + " ");

        }

    }

}
