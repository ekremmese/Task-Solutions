package day28_PracticeTasks;

import java.util.ArrayList;

public class Task6_MinNumber {
    /*
    6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //int min = Integer.MAX_VALUE;
        int min = numbers.get(0);

        for (Integer each : numbers) {
            if(each<min)
                min = each;
        }
        System.out.println(min);
    }
}
