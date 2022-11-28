package day13_PracticeTasks;

import day11_PracticeTasks.Task4_CydeoBatches;

import java.util.Scanner;

public class Task8_LogIn {

    public static void main(String[] args) {

        /*
        8. You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
         */

        String userName = "Cydeo";
        String password = "WoodenSpoon";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter user name: ");
        String usersName = input.next();

        System.out.println("Please enter your password: ");
        String usersPassword = input.next();

        if (usersName.equals(userName) && usersPassword.equals(password)) {
            System.out.println("Logged in");
        } else {
            System.out.println("Incorrect username or password");
        }

        input.close();

    }
}
