package day12_PracticeYasks;

import java.util.Scanner;

public class Task6_PlaceAnOrder {

    public static void main(String[] args) {

        /*
        6. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
         */
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the product name: ");
        String productName = input.nextLine();

        System.out.println("Please enter the price: ");
        double price = input.nextDouble();

        System.out.println("Please enter the quantity you want: ");
        int quantity = input.nextInt();

        System.out.println("Please enter your first name: ");
        String firstName = input.next();

        System.out.println(firstName + " your order for " + quantity +" "+ productName + " has been placed. Your total payment is " + (quantity*price) + " dollars.");

 */




        Scanner scan = new Scanner(System.in);

        System.out.println(" enter the prodcut name");
        String prodname = scan.nextLine();
        //scan.nextLine();
        System.out.println(" enter the price ");
        double price = scan.nextDouble();

        System.out.println("enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("enter their first name");
        String  firstname = scan.next();

        System.out.println(firstname+" your order for "+ quantity+prodname+ " has been places.Your total is "+quantity*price);



    }
}
