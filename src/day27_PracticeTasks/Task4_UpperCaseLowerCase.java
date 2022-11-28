package day27_PracticeTasks;

public class Task4_UpperCaseLowerCase {
    /*
    4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA Java";

		output:
			true
     */
    public static void main(String[] args) {

        String str = "JAVA javA!a ";
        System.out.println(isEquals(str));
    }

    public static boolean isEquals(String str) {
        char[] each = str.toCharArray();
        int counterUpperCase = 0;
        int counterLowerCase = 0;

        boolean r = false;

        for (int i = 0; i < each.length; i++) {

            if (Character.isUpperCase(each[i])) {
                counterUpperCase++;
            }
            if (Character.isLowerCase(each[i])) {
                counterLowerCase++;
            }

        }

        if (counterUpperCase == counterLowerCase) {
            r = true;
        }
        return r;
    }
}
