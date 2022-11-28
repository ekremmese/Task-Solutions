package day23_PracticeTasks;

public class Task16_FullNameRegularFormat {
    /*
    16.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"
     */

    public static void main(String[] args) {
     fullName("cydEO" , "SCHOOL");
    }

    public static void fullName(String firstName, String lastName) {

        String first = firstName.toUpperCase().charAt(0) + firstName.toLowerCase().substring(1);
        String last = lastName.toUpperCase().charAt(0) + lastName.toLowerCase().substring(1);

        System.out.println(first + " " + last);
    }
}
