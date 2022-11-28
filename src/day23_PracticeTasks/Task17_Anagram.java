package day23_PracticeTasks;

import java.util.Arrays;

public class Task17_Anagram {

    /*
     17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
     */

    public static void main(String[] args) {

        anagram("silent", "listen");

    }

    public static void anagram(String first, String last) {

        char[] arr1 = first.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = last.toCharArray();
        Arrays.sort(arr2);

        if ( Arrays.equals(arr1,arr2)) {
            System.out.println(first + " and " + last + " are anagram words");
        } else {
            System.out.println(first + " and " + last + " are not  anagram words");

        }

    }

}
