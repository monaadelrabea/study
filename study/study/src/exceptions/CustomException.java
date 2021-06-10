package exceptions;

/**
 * Name : CustomException
 * <br>
 * Description :
 * <br>
 * Date : 10/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class CustomException extends Exception {

    String message;

    CustomException(String str) {
        message = str;
    }

    public String toString() {
        return ("Custom Exception Occurred: " + message);
    }

}
