package day24_PracticeTasks;

public class Task4_Palindrome {
    /*
    4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "LEvel"

					isPalindrome(str) ===> true
     */

    public static void main(String[] args) {

        palindrome("Racecar"); //racecaR
    }

    public static void palindrome(String motto) {

        motto = motto.toLowerCase();

        String result = "";

        for (int i = motto.length() - 1; i >= 0; i--) {
            result += motto.charAt(i);
        }

        if (motto.equals(result)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }


}
