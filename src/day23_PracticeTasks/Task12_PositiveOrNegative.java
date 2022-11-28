package day23_PracticeTasks;

public class Task12_PositiveOrNegative {
    /*
    12. create a method that can if the given integer is positive, negative or zero
     */

    public static void main(String[] args) {

        posOrNeg(-5);
    }

    public static void posOrNeg(int number) {

        if (number == 0) {
            System.out.println("Number is zero.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is positive.");
        }


    }
}
