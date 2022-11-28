package day23_PracticeTasks;

public class Task5_GradeCalculation {
    /*
    5. create a method that can calculate the grade of the student based on the score
     */

    public static void main(String[] args) {

        grade(150);

    }

    public static void grade(int number){
        if(number<0 || number>100) {
            System.out.println("Invalid Grade");
        } else {
            if (number>=90) {
                System.out.println("A");
            } else if (number >= 80) {
                System.out.println("B");
            } else if (number>=70) {
                System.out.println("C");
            } else if (number>= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }

}
