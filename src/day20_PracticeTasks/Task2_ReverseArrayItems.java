package day20_PracticeTasks;

public class Task2_ReverseArrayItems {

    /*
    2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
     */

    public static void main(String[] args) {

        String[] names = {"John Stone", "Ekrem Mese", "Yahya Mese", "Sedat Temiz", "Aysun Doner", "Alexandr Dumas", "Emin Kaya", "Murat Deli", "Jimmy Break", "Osman Aydogdu"};

        //MY SOLUTION WITH FOR LOOP

        for (int i = 0; i < names.length; i++) {

            String each = names[i];
            String result = "";

            for (int j = each.length() - 1; j >= 0; j--) {
                char reverse = each.charAt(j);
                result += reverse;
            }

            System.out.println(result);

        }


        System.out.println("===================================================");

        //MUHTAR'S SOLUTION WITH FOR EACH LOOP

        for (String each : names) {
            String reversed = "";

            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);
            }

            System.out.println(reversed);
        }

    }
}
