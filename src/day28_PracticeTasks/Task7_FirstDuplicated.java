package day28_PracticeTasks;

import java.util.ArrayList;

public class Task7_FirstDuplicated {
    /*
    7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
     */
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(2);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(4);
        number.add(5);
        number.add(6);
        number.add(7);
        number.add(7);

        Integer result = 0;
        for (int i = 0,j=1; i < number.size() ; i++,j++) {

            if(number.get(i) == number.get(j)){
                result = number.get(i);
                break;
            }
        }
        System.out.println(result);

    }
}
