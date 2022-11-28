package day28_PracticeTasks;

import java.util.ArrayList;

public class Task3_MultiplyOdds {
    /*
    3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
/*
        for ( Integer each : list ){
            if ( each % 2 != 0) {
                each= each*2;
            }
            list.add(each);
        }

 */

        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
            if( list.get(i) % 2 != 0 ){
                list.set( i,element *= 2);
            }
        }

        System.out.println(list);
    }
}
