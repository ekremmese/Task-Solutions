package day26_PracticeTasks;

public class Task_2_5And2_6And2_7MultiplicationAndDivision {
    /*
    2.5 Creata a method that can return the multiplication of two integers
			2.6 Creata a method that can return the multiplication of two decimals
2.7 Create a method that passes two double parameters and return the division reslt
     */

    public static void main(String[] args) {

        System.out.println(multiply(2, 5));
        System.out.println(division(10, 5));
    }

    public static double division(double num1, double num2) {
        return num1/num2;
    }

    public static int multiply(int num1, int num2) {
        return num1*num2;
    }

    public static double multiply(double num1, double num2) {
        return num1*num2;
    }

}
