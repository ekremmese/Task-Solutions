package day20_PracticeTasks;

public class Task1_ClassMates {


    /*
    . create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

     */
    public static void main(String[] args) {

        String[] names = {"John Array", "Ekrem Mese", "Yahya Mese", "Sedat Temiz", "Aysun Doner", "Alexandr Dumas", "Emin Kaya", "Murat Deli", "Jimmy Break", "Osman Aydogdu"};


        // MY SOLUTION WITH FOR LOOP

        for (int i = 0; i < names.length; i++) {

            String each = names[i];
            int indexOfSpace = each.indexOf(" ");

            String initial = each.charAt(0) + "." + each.charAt(indexOfSpace + 1);

            System.out.println(initial);

        }

        System.out.println("===========================================");
        //SOLUTION OF MUHTAR WITH FOR EACH LOOP

        for (String each : names) {
            String initial = each.charAt(0) + "." + each.charAt(each.indexOf(" ") + 1);
            System.out.println(initial);
        }


    }
}
