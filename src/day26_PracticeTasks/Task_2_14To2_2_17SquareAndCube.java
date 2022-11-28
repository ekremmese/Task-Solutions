package day26_PracticeTasks;

public class Task_2_14To2_2_17SquareAndCube {
    /*
    2.14 Create a method that can return the square of an integer
					Ex: square(2) ==> 4
			2.15 Create a method that can return the square of a double

			2.16 Create a method that can return the cube of an integer
			2.17 Create a method that can return the cube of a double
     */

    public static void main(String[] args) {
        System.out.println(square(3));
    }

    //returns the square of Integer
    public static int square(int num) {
        return num * num;
    }

    //returns the square of double
    public static double square(double num) {
        return num * num;
    }

    //returns the cube of int
    public static int cube(int num) {
        return num * num * num;
    }

    //returns the cube of double
    public static double cube(double num) {
        return num * num * num;
    }
    
}
