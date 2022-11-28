package day15_PracticeTasks;

public class Task5_RetrieveDigits {

    public static void main(String[] args) {


        /*
         5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */


        //ASCII 0 to 65 535
        //a - z => 97 to 122 , A - Z

        String input = "mn@#1 23Ab!";
        int length = input.length();
        String resultDigits = "",
                resultLetters = "",
                resultSpecialChars = "";

        for (int i = 0; i < length ; i++) {

            char ch = input.charAt(i);
           if ( ch >= 'a' && ch <= 'z' || ch>= 'A' && ch <= 'Z') {
               resultLetters += ch;
           } else if (ch >='0' && ch <= '9') {
               resultDigits += ch;
           } else {
               if(ch != ' ') {    // If the special character is not space
                   resultSpecialChars += ch;
               }

           }


        }

        System.out.println("Letters = " + resultLetters);
        System.out.println("Digits = " + resultDigits);
        System.out.println("Special Chars = " + resultSpecialChars);


    }
}
