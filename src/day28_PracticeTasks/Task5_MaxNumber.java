package day28_PracticeTasks;

import java.util.ArrayList;

public class Task5_MaxNumber {
    /*
    5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //int max = Integer.MIN_VALUE;
        int max = list.get(0);

        for ( Integer a : list ){
            if (a>max){
                max = a;
            }
        }

        System.out.println(max);

    }
}
