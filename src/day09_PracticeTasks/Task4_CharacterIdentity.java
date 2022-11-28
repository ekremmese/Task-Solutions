package day09_PracticeTasks;

public class Task4_CharacterIdentity {
    public static void main(String[] args) {

       /* 4. Create a class called CharacterIdentity, and write a program that can identify if
       the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

        Ex:
        ch = '@'

        output:
        Special Character

        HINT: You may wanna check out the numbers of the chracters on ASCII table

        */

        /*
        in the ASCII table from 48 to 57 => 0 - 9 numbers
        from 65 to 90 inclusive A - Z upper case letters
        from 97 to 122 inclusive a - z lower case letters
         */

        ;
        char ch = 'Z';
        String result = "";
        if (ch >= 48 && ch < 57) {
            result = "Numbers";
        } else if (ch >= 65 && ch <= 90) {
            result = "Upper Case letters";
        } else if (ch >= 97 && ch <= 122) {
            result = "Lowe Case Letters";
        } else {
            result = "Special Characters";
        }
        System.out.println(result);


    }
}
