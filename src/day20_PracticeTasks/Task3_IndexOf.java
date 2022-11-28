package day20_PracticeTasks;

import java.sql.SQLOutput;

public class Task3_IndexOf {
    /*
    3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
     */
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "AirPods", "iPad", "Gloves", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        int indexOf = 0;

        for (int i = 0; i < items.length; i++) {
            String each = items[i];
            if (each.equals("Gloves")) {
                indexOf = i;
                System.out.println("Index of \"Gloves\" is: " + i);
            }


        }

        System.out.println("__________________________________________");

        for (int i = 0; i < items.length; i++) {

            String each = items[i];
            if (each.contains("iPad")) {
                System.out.println("\"iPad\" is contained in the item list");
                break;
            }
        }

        System.out.println("__________________________________________");

        for (int i = 0; i < items.length; i++) {

            System.out.println(items[i] + " - " + prices[i] + " - " + itemIDs[i]);

        }


    }
}
