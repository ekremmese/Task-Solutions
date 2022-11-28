package day10_PracticeTasks;

public class Task1_GradeLEvel {

    public static void main(String[] args) {


        /*

        Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */

        byte grade = 1;
        String schoolLevel = " ";

        if (grade >= 1 && grade <= 18) {     // If start coding the Ifs from Grad School => Elemantary School we can use simple booleans
            if (grade >= 17) {
                schoolLevel = "Grad school";
            } else if (grade >= 13) {
                schoolLevel = "College";
            } else if (grade >= 9) {
                schoolLevel = "High school";
            } else if (grade >= 6) {
                schoolLevel = " Middle School";
            } else {
                schoolLevel = "Elemantary School";
            }
        } else {
            schoolLevel = "Please entere a valid number.";

        }

        System.out.println(schoolLevel);
    }

}
