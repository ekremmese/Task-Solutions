package day23_PracticeTasks;

public class Task1_ {

    /*
    1. create a method that can print odd numbers between 1~100 in a same line saperated by space
     */

    public static void oddNumbers(){
        for (int i = 1; i <100 ; i+=2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        oddNumbers();
    }

}

