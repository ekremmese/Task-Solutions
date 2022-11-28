package day33_PracticeTasks;

public class ReverseString {

    public static void main(String[] args) {

        String name = "Java";  //avaJ
                     //0123   name.length()=4
        String result ="";

        for (int i = name.length()-1; i >= 0 ; i--) {
            result+= name.charAt(i);
        }

        System.out.println(result);

    }
}
