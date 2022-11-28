package day24_PracticeTasks;

public class Task1_frequencyOfWord {
    /*
    1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
     */

    public static void main(String[] args) {


        frequencyOfWord("Java java java python python", "java");

    }

    public static void frequencyOfWord(String sentence, String word) {


        int frequency = 0;

        for (int i = 0; i < sentence.length() - (word.length() - 1); i++) {

            if (sentence.substring(i, i + word.length()).equals(word)) {
                frequency++;
            }


        }

        System.out.println(frequency);


    }

}

//DAY 16 - TASK4 - I got help from