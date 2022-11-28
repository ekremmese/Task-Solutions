package day23_PracticeTasks;

public class Task15_Calculator {
    /*
    15. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

     */

    public static void main(String[] args) {

        calculator(10,4,'a');

    }

    public static void calculator(double num1, int num2, char ch){

        if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.out.println("Invalid Math Operator");
        } else {
            if (ch == '+') {
                System.out.println(num1+num2);
            } else if (ch=='-') {
                System.out.println(num1-num2);
            } else if (ch=='*'){
                System.out.println(num1*num2);
            } else {
                System.out.println(num1/num2);
            }
        }

    }



}
