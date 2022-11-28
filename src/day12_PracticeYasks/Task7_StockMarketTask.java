package day12_PracticeYasks;

import java.util.Scanner;

public class Task7_StockMarketTask {

    public static void main(String[] args) {

        /*
        7. StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how many share you have already? ");
        int shares = input.nextInt();

        System.out.println("Please enter total value in the stock market: ");
        double value = input.nextDouble();

        input.nextLine();  // Clears the enter that comes from valueENTER

        System.out.println("Please enter the name of the company you have shares: ");
        String company = input.nextLine();

        System.out.println("Your total stock market holding is $" + value + " which is made up of " + shares + " shares. " + company + " is your company holdings.");

    }
}
