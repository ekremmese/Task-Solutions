package day11_PracticeTasks;

public class Task1_CappuccinoBuyer {

    public static void main(String[] args) {

        /*

        1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */

        String size = "tall";
        double price ; //temporary assigned to zero  // without temporary assignment it works fine
        int calories ; //temporary assigned to zero
        String result ; //temporary assigned to ""
        //SOLUTION WITH IF STATEMENT
        if (size == "tall" || size == "grande" || size == "venti") {
            if (size == "tall") {
                price = 3.69;
                calories = 90;
                result = "price is $" + price + "\n" + calories + " calories";
            } else if (size == "grande") {
                price = 3.99;
                calories = 120;
                result = "price is $" + price + "\n" + calories + " calories";
            } else {
                price = 4.29;
                calories = 150;
                result = "price is $" + price + "\n" + calories + " calories";
            }

        } else {
            result = "Invalid size";
        }

        System.out.println(result);

        System.out.println("==============================================================");

        //SOLUTION WITH SWITCH STATEMENT

        switch (size) {
            case "tall":
                price = 3.69;
                calories = 90;
                result = "price is $" + price + "\n" + calories + " calories";
                break;
            case "grande":
                price = 3.99;
                calories = 120;
                result = "price is $" + price + "\n" + calories + " calories";
                break;
            case "venti":
                price = 4.29;
                calories = 150;
                result = "price is $" + price + "\n" + calories + " calories";
                break;
            default:
                result = "Invalid size";
        }
        System.out.println(result);

        System.out.println("==============================================================");

        //SOLUTION WITH IF AND SWITCH STATEMENT MIXED

        if (size == "tall" || size == "grande" || size == "venti") {
            switch (size) {
                case "tall":
                    price = 3.69;
                    calories = 90;
                    result = "price is $" + price + "\n" + calories + " calories";
                    break;
                case "grande":
                    price = 3.99;
                    calories = 120;
                    result = "price is $" + price + "\n" + calories + " calories";
                    break;
                default:  // here default stands for size = "venti";
                    price = 4.29;
                    calories = 150;
                    result = "price is $" + price + "\n" + calories + " calories";

            }

        } else {
            result = "Invalid size";
        }

        System.out.println(result);

    }
}
