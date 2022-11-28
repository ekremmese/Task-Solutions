package ExtraInformation;

public class MathTips {

    public static void main(String[] args) {

        double x = 5.9;
        int y = 16;

        double z = Math.max(x, y); //math.max (x,y); gives us the maximum between x and y

        System.out.println(z);

        double t = Math.sqrt(y); // gives square root of the number, if you assign it as a value of a declared variable you must make it double


        System.out.println("t = " + t);

        double a = Math.random();   // Math.random() assignes a value to variable here, between 0 (inclusive), and 1 (exclusive).
        System.out.println("a = " + a);

        Math.random();

        int m = 10;
        int n = 20;

        System.out.println(m > n); //// even we did not define any boolean here this command gives us false


    }
}
