package day16_PracticeTasks;

public class Task5_StringAppear {

    /*
    5. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
     */

    public static void main(String[] args) {

        String word = "caT dog dogG cAt";
        int frequencyCat = 0;
        int frequencyDog = 0;
        for (int i = 0; i < word.length() - 4; i++) {
            if (word.toLowerCase().substring(i, i + 4).equals("cat")) {
                frequencyCat++;
            }
            if (word.toLowerCase().substring(i, i + 4).equals("dog")) {
                frequencyDog++;
            }
        }


        if (frequencyCat == frequencyDog) {
            System.out.println("true");
        }


    }
}
