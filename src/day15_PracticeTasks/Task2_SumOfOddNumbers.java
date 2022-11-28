package day15_PracticeTasks;

public class Task2_SumOfOddNumbers {

    public static void main(String[] args) {


        int result = 0;

        /* for (int i = 99; i >0 ; i-=2) {
            result += i;
        }

         */

        //System.out.println(result);

        for (int i = 1; i <100 ; i+=2) {
            result +=i;
        }
        System.out.println(result);
    }
}
