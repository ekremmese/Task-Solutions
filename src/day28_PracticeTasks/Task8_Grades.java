package day28_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8_Grades {
    /*
    8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F

     */

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer each : scores) {
            if ( each >= 90 && each <= 100)
                gradeOfA.add(each);
            else if (each>=80 ) {
                gradeOfB.add(each);
            } else if (each>=70) {
                gradeOfC.add(each);
            } else if (each>= 60) {
                gradeOfD.add(each);
            } else {
                gradeOfF.add(each);
            }
        }

        System.out.println("Total numbers of A: " + gradeOfA.size() + " ==> " +  gradeOfA);
        System.out.println("Total numbers of B: " + gradeOfB.size() + " ==> " +  gradeOfB);
        System.out.println("Total numbers of C: " + gradeOfC.size() + " ==> " +  gradeOfC);
        System.out.println("Total numbers of D: " + gradeOfD.size() + " ==> " +  gradeOfD);
        System.out.println("Total numbers of F: " + gradeOfF.size() + " ==> " +  gradeOfF);

    }
}
