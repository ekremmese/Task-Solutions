package day16_PracticeTasks;

public class Task4_JavaFrequency {

    /*
    4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
     */

    public static void main(String[] args) {

        String word = "Java Java";
        //012345678
        int frequency = 0;
        System.out.println(word.length());

        for (int i = 0; i < word.length() - 3; i++) {

            if (word.substring(i, i + 4).equals("Java")) {
                frequency++;
            }

        }

        System.out.println(frequency);


    }
}
