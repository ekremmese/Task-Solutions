package day28_PracticeTasks;

import java.util.ArrayList;

public class Task2_SwapFirstAndLastElement {
    /*
    2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
     */
    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int a = numbers.get(0);

        numbers.set(0, numbers.get(4));
        numbers.set(4,a);

        System.out.println(numbers);



    }
}
