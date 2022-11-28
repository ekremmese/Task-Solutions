package day27_PracticeTasks;

public class Task3_RetrieveLEttersDigits {
    /*
    . Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";

     */

    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        retrieve(str);

    }

    private static void retrieve(String str) {
        //valueOF method converts String to wrapper class
        //parse converts String to primitive

        char[] ch = str.toCharArray();

        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                digits += ch[i];
            }
            if (Character.isLetter(ch[i])) {
                letters += ch[i];
            }
            if (!(Character.isLetterOrDigit(ch[i]))) {
                specialChars += ch[i];
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);

    }
}
