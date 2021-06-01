package lamda.examples;

/**
 * Name : PredefinedFunctionalInterfaceExample
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class CustomFunctionalInterfaceExample {

    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = (a, b) -> a + b;
        System.out.println("Result: " + functionalInterfaceExample.sum(120, 100));

        //No argument lambda expression
        FunctionalInterfaceNoArgExample msg = () -> {
            return "Welcome to no argument lamda expression";
        };
        System.out.println(msg.noArgMethod());
    }

}


