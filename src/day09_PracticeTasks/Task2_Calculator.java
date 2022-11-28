package day09_PracticeTasks;

public class Task2_Calculator {

    public static void main(String[] args) {

        /*
        2. Create a class called Calculator, Given two double variables named n1 & n2, and a char variable named mathOperator, write a program that can calculate result of n1&n2 based on the given math Operator.

		char operator -> -, +, *, /

		when operator is + : add num1, num2
		when operator: - : minus num1, num2
		when operator: * : multiply num1, num2
		when operator: / : divide num1, num2
		for any other operators: print "invalid operator"

		Ex:
			n1 = 10, n2= 20, mathOperator = '+'

		output:
			30

         */

        double n1 = 10;
        double n2 = 20;
        char op = '*';
        double eq = 0;

        if (op == '+' || op == '-' || op == '/' || op == '*') {
            switch (op) {
                case '+':
                    eq = n1 + n2;
                    break;
                case '-':
                    eq = n1 - n2;
                    break;
                case '*':
                    eq = n1 * n2;
                    break;
                default:
                    eq = n1 / n2;

            }
        } else {
            System.out.println("Invalid Operator");
        }

        System.out.println(eq);
    }
}
