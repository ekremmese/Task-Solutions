package day10_PracticeTasks;

public class Task3_Grade {

    public static void main(String[] args) {

        /*

        Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */

        char grade = 'A';
        String status = (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') ? (grade == 'A') ? "Excellent" : (grade == 'B') ? "Great Job" : (grade == 'C') ? "Good" : (grade == 'D') ? "Passed" : "Failed"
                : "Invalid";
        System.out.println(status);


    }
}
