package exceptions;

/**
 * Name : CustomRuntimeException
 * <br>
 * Description :
 * <br>
 * Date : 10/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class CustomRuntimeException extends RuntimeException {

    String message;

    CustomRuntimeException(String str) {
        message = str;
    }

    public String toString() {
        return ("Custom Runtime Exception Occurred: " + message);
    }

}
