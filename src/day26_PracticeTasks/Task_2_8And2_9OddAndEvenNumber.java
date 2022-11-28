package day26_PracticeTasks;

public class Task_2_8And2_9OddAndEvenNumber {
    /*
    2.8 Create a method that can check if an integer is even number
			2.9 Create a method that can check if an integer is odd number
     */

    public static void main(String[] args) {
        oddNumber(5);
    }

    public static void oddNumber(int number) {
        if(number%2 == 0){
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number");
        }
    }
}
