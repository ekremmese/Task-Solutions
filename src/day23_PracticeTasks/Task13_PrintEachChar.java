package day23_PracticeTasks;

public class Task13_PrintEachChar {
    /*
    13. create a method named printEachChar that can print each characters of a string
     */

    public static void main(String[] args) {

        printEachChar("Java");
    }

    public static void printEachChar(String word){

       char[] ch =  word.toCharArray();

        for (char each : ch) {
            System.out.print(each + " ");
        }

    }

}
