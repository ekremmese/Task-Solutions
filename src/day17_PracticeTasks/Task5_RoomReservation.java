package day17_PracticeTasks;

import java.util.Scanner;

public class Task5_RoomReservation {
    /*
     5. Create a class called RommReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Would you like to reserve a room?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid answer. Please re-enter. Would you like to reserve a room");
                answer = input.next().toLowerCase();
            }

            //  I MAY NEED ADDITIONAL INPUT.NEXTLINE HERE
            input.nextLine();

            if (answer.equals("yes")) {
                System.out.println("Please enter type of room you want: ");
                String roomType = input.nextLine().toLowerCase();

                while (!(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))) {
                    System.out.println("Invalid entry. Please re-enter. Please enter type of room you want:");
                    roomType = input.nextLine().toLowerCase();
                }

                if (roomType.equals("king bed")) {
                    System.out.println(roomType + " 120$");
                } else if (roomType.equals("queen bed")) {
                    System.out.println(roomType + " 100$");
                } else {
                    System.out.println(roomType + " 80$");
                }
                break;
            } else {
                System.out.println("Have a nice day.");
                break;
            }


        }


        input.close();


    }
}
