package day11_PracticeTasks;

public class Task4_CydeoBatches {

    public static void main(String[] args) {

        /*
        4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */

        String batch = "US evening",
                result;
        //Solution 1: use if statement

        if (batch == "US morning" || batch == "US evening" || batch == "EU") {
            if (batch == "US morning") {
                result = "Class times are 10-5 EST. M, T, Th, F.";
            } else if (batch == "US evening") {
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
            } else {
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
            }

        } else {
            result = "Invalid Batch";
        }
        System.out.println(result);

        System.out.println("================================================");

        //Solution 2: use switch statement

        switch (batch) {
            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
            default:
                result = "Invalid Batch";
        }
        System.out.println(result);

        System.out.println("================================================");

        //Solution 2: use if & switch statements mixed

        if (batch == "US morning" || batch == "US evening" || batch == "EU") {
            switch (batch) {
                case "US morning":
                    result = "Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    result = "Class times are  10-5 EST. M, T, W, Th, F.";

            }

        } else {
            result = "Invalid Batch";
        }
        System.out.println(result);

    }
}
