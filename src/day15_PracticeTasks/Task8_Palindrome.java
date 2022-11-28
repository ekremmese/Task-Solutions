package day15_PracticeTasks;

public class Task8_Palindrome {

    /*
    8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
     */

    public static void main(String[] args) {

        String word = "Anna";
        int length= word.length();
        String reverse = "";


        for (int i = length - 1 ; i >=0 ; i--) {
            reverse += word.charAt(i);
        }

        System.out.println(reverse);

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }




    }


}
