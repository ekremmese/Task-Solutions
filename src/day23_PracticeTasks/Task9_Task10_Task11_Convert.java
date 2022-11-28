package day23_PracticeTasks;

public class Task9_Task10_Task11_Convert {

    /*
    9. create a method that can convert dollar to euro

	10. create a method that can can convert dollar to lira

	11. create a method that can convert kg to lb
     */

    public static void main(String[] args) {

        dollarToEuro(100);
        dollarToLira(100);
        kgToLb(3);


    }

    public static void dollarToEuro ( double usd) {
        double rate = 0.99;
        double euro = usd *rate;
        System.out.println(usd + " dollar is " + euro + " euros");
    }

    public static void dollarToLira ( double usd) {
        double rate = 18.60;
        double lira = usd *rate;
        System.out.println(usd + " dollar is " + lira + " liras");
    }

    public static void kgToLb (double kg) {
        double rate = 2.20;
        double lb = rate*kg;
        System.out.println(kg + " kg is " + lb + " pounds");
    }

}
