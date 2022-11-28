package day10_PracticeTasks;

public class Task4_AgeGroups {

    public static void main(String[] args) {

        /*
        age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */

        //Solution with Ternary&Nested IF
        int ageNumber = 7;
        //String ageGroup= "";

        String ageGroup = (ageNumber >= 0 && ageNumber < 150) ? (ageNumber >= 55) ? "Senior" : (ageNumber >= 21) ? "Adult" : "Teenager" : "Invalid";
        System.out.println(ageGroup);

        //Solution with if

        int age = 6;
        String groupAge = "";

        if (ageNumber >= 0 && ageNumber < 150) {

            if (ageNumber >= 55) {
                groupAge = "Senior";
            } else if (ageNumber >= 21) {
                groupAge = "Adult";
            } else {
                groupAge = "Teenager";
            }

        } else {
            groupAge = "Invalid";
        }

        System.out.println(groupAge);


    }
}
