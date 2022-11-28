package day15_PracticeTasks;

public class Task7_ReverseString {

    public static void main(String[] args) {

        /*
        7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
         */

        String word = "123456";
        int length = word.length();
        //char ch  = 'x';

        for (int i = length - 1; i >= 0; i--) {
            System.out.print( "" + word.charAt(i) );
        }

        //System.out.print(result);

    }
}
