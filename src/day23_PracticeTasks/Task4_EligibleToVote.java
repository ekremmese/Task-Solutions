package day23_PracticeTasks;

public class Task4_EligibleToVote {
    /*
    4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!
     */

    public static void main(String[] args) {

        eligibleToVote(21,"UA");

    }

    public static void eligibleToVote(int age, String citizen){

        if(age<1 || age >=120) {

            System.out.println("Invalid age");

        } else {
            if (age >= 18 && citizen.equalsIgnoreCase("USA")) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        }


    }
}
