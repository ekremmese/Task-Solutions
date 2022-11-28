package day11_PracticeTasks;

public class Task3_BrowserName {

    public static void main(String[] args) {

        /*
        3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary

         */

        String browserName = "opera";
        String result ;
        String standartText = "Your browser is ";

        switch (browserName) {
            case "chrome":
                result = standartText + browserName;
                break;
            case "opera":
                result = standartText + browserName;
                break;
            case "safari":
                result = standartText + browserName;
                break;
            case "edge":
                result = standartText + browserName;
                break;
            case "firefox":
                result = standartText + browserName;
                break;
            default:
                result = "Invalid browser";
        }
        System.out.println(result);

    }
}
