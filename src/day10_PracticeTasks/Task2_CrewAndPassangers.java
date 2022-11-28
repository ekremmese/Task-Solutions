package day10_PracticeTasks;

public class Task2_CrewAndPassangers {

    public static void main(String[] args) {




        /*
        Create a class called CrewAndPassangers, Given a number of people on the ship (int number),
        determine how many need to be crew members and how many can be passengers.
        Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        int numberOfPeople = 56;
        String passengerReport = " ";

        if (numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100) {
            if (numberOfPeople == 50) {
                passengerReport = "20 crew, 30 passengers";
            } else if (numberOfPeople == 75) {
                passengerReport = "25 crew, 50 passengers";
            } else {
                passengerReport = "30 crew, 70 passengers";
            }
        } else {
            passengerReport = "Please enter a valid number!";
        }

        System.out.println(passengerReport);
    }
}
