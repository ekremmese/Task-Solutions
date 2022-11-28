package day08_PracticeTasks;

public class Task1_IsEligibleToBuyCigarette {

    public static void main(String[] args) {

        /*
        	1. Given a number (byte) age, write a program that can
        	check if the person is eligible to buy Cigarettes
         */


        byte age = 13;

        boolean eligible = age >= 21;

        if (eligible) {
            System.out.println("Eligible to buy cigarette");
        } else {
            System.out.println("Not eligible to buy cigarettes.");
        }


    }
}
