package exceptions;

/**
 * Name : examples
 * <br>
 * Description :
 * <br>
 * Date : 10/06/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class examples {

    public static void main(String args[]) {
        customExceptionMethod();
        customRunTimeExceptionMethod();
    }

    private static void customExceptionMethod() {
        try {
            throw new CustomException("This is a custom message");
        } catch(CustomException e) {
            System.out.println(e);
        } finally {
            System.out.println("In finally Block");
        }
    }

    private static void customRunTimeExceptionMethod() {

        String val = "Hello World";
        if(val.length() > 3) {
            throw new CustomRuntimeException("Length is exceeding length 3");
        }
    }
    
}
