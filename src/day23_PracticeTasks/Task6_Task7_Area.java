package day23_PracticeTasks;

public class Task6_Task7_Area {

    /*
    6. create a method that can calculate the area of a circle

	7. create a method that can calculate the area of a square
     */

    public static void main(String[] args) {

        areaOfCircle(2);
        areaOfSquare(2);
    }

    public static void areaOfCircle(double radius) {
        double area = radius * radius * 3.14;
        System.out.println(area);
    }

    public static void areaOfSquare(int side) {
        double area = side * side;
        System.out.println(area);
    }
}
