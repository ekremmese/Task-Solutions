package day28_PracticeTasks;

import java.util.ArrayList;

public class Task4_MergeArrayLists {
    /*
    4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

     */

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        arr1.add("A");
        arr1.add("B");
        arr1.add("C");

        arr2.add("D");
        arr2.add("E");
        arr2.add("F");
        arr2.add("G");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr1.size(); i++) {
            list.add(arr1.get(i));
        }
        for (int i = 0; i < arr2.size(); i++) {
            list.add(arr2.get(i));
        }

        System.out.println(list);

    }
}
