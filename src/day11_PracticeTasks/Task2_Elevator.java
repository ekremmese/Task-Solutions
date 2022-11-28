package day11_PracticeTasks;

public class Task2_Elevator {

    public static void main(String[] args) {
        /*

        2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 3: use if & switch statements mixed
         */

        int floorNum = 2;
        String result;

        //Solution 1: use nested if statement

        if (floorNum >= 1 && floorNum <= 3) {
            if (floorNum == 1) {
                result = "Floor " + floorNum + " selected. Companies: Lobby Verizon, Starbucks";
            } else if (floorNum == 2) {
                result = "Floor " + floorNum + " selected. Companies: Cybertek, NASA, Intelsat";
            } else {
                result = "Floor " + floorNum + " selected. Companies: Lyft, BofA, Stake house";
            }

        } else {
            result = "Invalid floor";
        }

        System.out.println(result);

        System.out.println("=======================================================================");

        // Solution 2: use switch statement

        switch (floorNum) {
            case 1:
                result = "Floor " + floorNum + " selected. Companies: Lobby Verizon, Starbucks";
                break;
            case 2:
                result = "Floor " + floorNum + " selected. Companies: Cybertek, NASA, Intelsat";
                break;
            case 3:
                result = "Floor " + floorNum + " selected. Companies: Lyft, BofA, Stake house";
                break;
            default:
                result = "Invalid floor";
        }
        System.out.println(result);

        System.out.println("=======================================================================");

        // Solution 3: use if & switch statements mixed

        if (floorNum >= 1 && floorNum <= 3) {
            switch (floorNum) {
                case 1:
                    result = "Floor " + floorNum + " selected. Companies: Lobby Verizon, Starbucks";
                    break;
                case 2:
                    result = "Floor " + floorNum + " selected. Companies:Cybertek, NASA, Intelsat";
                    break;
                default:
                    result = "Floor " + floorNum + " selected. Companies: Lyft, BofA, Stake house";

            }

        } else {
            result = "Invalid floor";
        }
        System.out.println(result);
    }
}
