package day21_PracticeTasks;

public class Task4_HowManyPalindrome {

    /*
    4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
     */

    public static void main(String[] args) {

        String[] arr = {"anna", "level", "Java"};
        int counter = 0;

        for (String each : arr) {

            String word = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                word += each.charAt(i);
                if (word.equalsIgnoreCase(each)) {
                    counter++;
                }
            }

        }

        System.out.println(counter);
    }


}
