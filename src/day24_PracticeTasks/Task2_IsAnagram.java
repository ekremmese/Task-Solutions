package day24_PracticeTasks;

import java.util.Arrays;

public class Task2_IsAnagram {
    /*
    2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
     */

    public static void main(String[] args) {

        isAnagram("cba", "abc");
    }

    public static void isAnagram(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
