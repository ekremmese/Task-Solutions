package day23_PracticeTasks;

public class Task3_EligibleToBuyAlcohol {

    /*
    3. create a method that can check if a person is eligible to buy alcohol
     */

    public static void main(String[] args) {

        eligibleToBuyAlcohol(10);

    }

    public static void eligibleToBuyAlcohol(int age) {

        if (age < 1 || age >= 120) {
            System.out.println("Invalid age");
        } else {
            if (age >= 18) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible ");
            }
        }


    }


}
