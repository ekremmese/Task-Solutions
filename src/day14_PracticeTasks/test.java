package day14_PracticeTasks;

public class test {

    public static void main (String[] args){

        String result = "";

        for ( int i = 1; i <100; i++){

            result = (i%15 == 0) ? "FINRA " : (i%3 ==0) ? "FIN " : (i%5 == 0) ? "RA " : " "+i+" ";
            System.out.print(result);


        }


    }
}
