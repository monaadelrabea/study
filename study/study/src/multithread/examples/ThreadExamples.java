package multithread.examples;

/**
 * Name : ThreadExamples
 * <br>
 * Description :
 * <br>
 * Date : 30/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class ThreadExamples {

    public static void main(String[] args) {
        PrintThread thread1, thread2, thread3, thread4;

        thread1 = new PrintThread("thread1");
        thread2 = new PrintThread("thread2");
        thread3 = new PrintThread("thread3");
        thread4 = new PrintThread("thread4");

        System.out.println("\nStarting threads");
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("Threads started\n");
    }

}
