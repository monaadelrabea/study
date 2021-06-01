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
public class PredefinedFunctionalInterfaceExample {

    public static void main(String[] args) {

        // Implementing Runnable using anonymous class (legacy way)
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread name : " + Thread.currentThread().getName());
            }
        };
        Thread thread1 = new Thread(runnable1);

        // Implementing Runnable using Lambda expression because Runnable having
        // only one abstarct method run()
        Runnable runnable2 = () -> {
            System.out.println("Thread name : " + Thread.currentThread().getName());
        };
        Thread thread2 = new Thread(runnable2);

        // Start Threads
        thread1.start();
        thread2.start();
    }

}
