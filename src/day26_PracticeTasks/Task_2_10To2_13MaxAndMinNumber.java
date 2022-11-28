package day26_PracticeTasks;

public class Task_2_10To2_13MaxAndMinNumber {
    /*
    2.10 Create a method that can return the maximum number between two integers
			2.11 Create a method that can return the maximum number between two decimal numbers

			2.12 Create a method that can return the minimum number between two integers
			2.13 Create a method that can return the minimum number between two decimal numbers
     */
    public static void main(String[] args) {
        System.out.println(maxNumber(2, 4));
    }

    //compares two integer and returns max
    public static int maxNumber(int num1, int num2) {
        if ( num1 > num2)
            return num1;
            else
                return num2;
    }

    //compares two double and returns max
    public static double maxNumber(double num1, double num2) {
        if ( num1 > num2)
            return num1;
        else
            return num2;
    }

    //compares two int and returns min
    public static int minNumber(int num1, int num2) {
        if ( num1 < num2)
            return num1;
        else
            return num2;
    }

    //compares two double and returns min
    public static double minNumber(double num1, double num2) {
        if ( num1 < num2)
            return num1;
        else
            return num2;
    }
}
