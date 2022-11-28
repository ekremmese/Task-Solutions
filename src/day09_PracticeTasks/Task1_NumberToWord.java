package day09_PracticeTasks;

public class Task1_NumberToWord {

    public static void main(String[] args) {

        /*
        1. Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
         */

        int number = 10;
        String result;

        if (number >= 0 && number <= 9) {

            result = (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two"
                    : (number == 3) ? "Three" : (number == 4) ? "Four" : (number == 5) ? "Five"
                    : (number == 6) ? "Six" : (number == 7) ? "Seven" : (number == 8) ? "Eight"
                    : "Nine";

        } else {
            result = "Invalid Number";
        }

        System.out.println(result);
    }
}
