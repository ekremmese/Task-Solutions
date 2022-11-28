package day18_PracticeTasks;

import java.util.Scanner;

public class Task2_RoomReservation_DEFECT_EXISTS {

    /*
2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Which bedroom do you want to reserve? ");
            String roomSize = input.nextLine().toLowerCase();


            while (!(roomSize.equals("king bed") || roomSize.equals("queen bed") || roomSize.equals("single bed"))) {
                System.err.println("Invalid entry. Please re-enter.Which bedroom do you want to reserve? ");
                roomSize = input.nextLine().toLowerCase();
            }

            System.out.println("How many nights do you want to stay?");
            int nights = input.nextInt();

            while (!(nights > 0)) {
                System.err.println("Invalid entry.Please re-enter. How many nights do you want to stay?");
                nights = input.nextInt();
            }

            System.out.println("Would you like to reserve another room?");
            String anotherRoom = input.next().toLowerCase();

            while (!(anotherRoom.equals("yes") || anotherRoom.equals("no")))
                System.err.println("Invalid entry.Please re-enter. Would you like to reserve another room?");
            anotherRoom = input.next().toLowerCase();


            if (anotherRoom.equals("no")) {
                break;
            }


        }


        input.close();

    }
}
