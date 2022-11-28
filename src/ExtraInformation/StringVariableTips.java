package ExtraInformation;

public class StringVariableTips {

    public static void main(String[] args) {

        String name = "HAMDI";

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase()); // makes the text to uppercase
        System.out.println(name.toLowerCase()); // makes the text appear in console in lowercase

        String firstName = "ekrem";
        String lastName = "mese";

        System.out.println(firstName.concat(lastName)); //concatenate method

        String txt = " Hello World";
        System.out.println(txt.indexOf("h")); // gives us where the e located, if there is no such letter gives you -1 as result




    }
}
