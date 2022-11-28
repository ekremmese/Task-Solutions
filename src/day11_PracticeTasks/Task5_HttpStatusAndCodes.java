package day11_PracticeTasks;

public class Task5_HttpStatusAndCodes {

    public static void main(String[] args) {


        /*

        5. HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by
	the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable


         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

         */
        int code = 4543545;
        String message = " "; //temporary assigned to "

        // SOLUTION WITH IF STATEMENTS
        if (code == 200 || code == 201 || code == 202 || code == 301 || code == 303 || code == 304 || code == 304 || code == 307 || code == 400 || code == 401 || code == 403 || code == 404 || code == 410 || code == 500 || code == 503) {
            if (code == 200) {
                message = "OK";
            } else if (code == 201) {
                message = "Created";
            } else if (code == 202) {
                message = "Accepted";
            } else if (code == 301) {
                message = "Moved Permanently";
            } else if (code == 303) {
                message = "See Other";
            } else if (code == 304) {
                message = "Not Modified";
            } else if (code == 307) {
                message = "Temporary Redirect";
            } else if (code == 400) {
                message = "Bad Request";
            } else if (code == 401) {
                message = "Unauthorized";
            } else if (code == 403) {
                message = "Forbidden";
            } else if (code == 404) {
                message = "Not Found";
            } else if (code == 410) {
                message = "Gone";
            } else if (code == 500) {
                message = "Internal Server Error";
            } else {
                message = "Gone";
            }


        } else {
            message = "Invalid Number";
        }

        System.out.println(message);

        System.out.println("=========================================================================");

        //SOLUTION WITH SWITCH STATEMENTS

        switch (code) {
            case 200:
                message = "OK";
                break;
            case 201:
                message = "Created";
                break;
            case 202:
                message = "Accepted";
                break;
            case 301:
                message = "Moved Permanently";
                break;
            case 303:
                message = "See Other";
                break;
            case 304:
                message = "Not Modified";
                break;
            case 307:
                message = "Temporary Redirect";
                break;
            case 400:
                message = "Bad Request";
                break;
            case 401:
                message = "Unauthorized";
                break;
            case 403:
                message = "Forbidden";
                break;
            case 404:
                message = "Not Found";
                break;
            case 410:
                message = "Gone";
                break;
            case 500:
                message = "Internal Server Error";
                break;
            case 503:
                message = "Service Unavailable";
                break;
            default:
                message = "Invalid Number";

        }
        System.out.println(message);

    }
}
