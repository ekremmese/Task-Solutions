package day12_PracticeYasks;

import java.util.Scanner;

public class Task2_SpeedLimit {

    /*
    2. Write a program for the speed check. a variable named speedLimit is given and assigned,
    ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int speedLimit = 50;

        System.out.println("Please enter your speed: ");
        int currentSpeed = input.nextInt();

        System.out.println("You're driving " + (currentSpeed - speedLimit) + " mph over the limit. Slow down!");

    }


}
