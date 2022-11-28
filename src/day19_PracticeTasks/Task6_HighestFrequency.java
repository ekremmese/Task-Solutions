package day19_PracticeTasks;

public class Task6_HighestFrequency {
    /*
    6.  Write a program that can find the character that has the highest frequency from a string

     */
    public static void main(String[] args) {

        String word = "afffggtt";
        int maxFreq = 0;
        String result = "";


        for (int j = 0; j < word.length(); j++) {

            char ch = word.charAt(j);
            int counter = 0;
            for (int i = 0; i < word.length(); i++) {

                char each = word.charAt(i);

                if (ch == each) {
                    counter++;
                }


                if (counter > maxFreq) {
                    maxFreq = counter;
                }


            }

        }
        System.out.println(maxFreq);
        //System.out.println(result);
// ABOVE THIS I FIND ONLY THE MAXFEQ

        // AFTER THIS LINE I PRINT THE CHARACTER WHICH HAS THE MAXFREQ

        for (int i = 0; i < word.length(); i++) {

            int count = 0;
            char a = word.charAt(i);

            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);
                if (a == each) {
                    count++;
                }
            }

            if (count == maxFreq) {
                result = "" + a;
            }


        }
        System.out.println(result);
    }


}

//  whıch charatrers frequency equals to that number ????