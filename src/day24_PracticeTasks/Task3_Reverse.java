package day24_PracticeTasks;

public class Task3_Reverse {
    /*
    3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
     */

    public static void main(String[] args) {

        reverse("Java is a cool programming language.");

    }

    public static void reverse(String word){

        String result = "";

        for (int i = word.length()-1; i >=0 ; i--) {

        result += word.charAt(i);

        }

        System.out.println(result);
    }

}
