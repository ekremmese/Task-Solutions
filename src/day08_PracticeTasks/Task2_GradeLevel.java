package day08_PracticeTasks;

public class Task2_GradeLevel {

    public static void main(String[] args) {

        /*
        2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
         */

        byte gradeLevel = 4;

        if (gradeLevel>= 1 && gradeLevel <= 5 ) {
            System.out.println("Elemantary School");
        }
        if (gradeLevel>= 6 && gradeLevel <= 8) {
            System.out.println("Middle school");
        }
        if (gradeLevel>= 9 && gradeLevel <= 12) {
            System.out.println("High school");
        }
        if (gradeLevel>= 13 && gradeLevel <= 16) {
            System.out.println("college");
        }

        if (gradeLevel>= 17 && gradeLevel <= 18) {
            System.out.println("Grad school");
        }




    }
}
