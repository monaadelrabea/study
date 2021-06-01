package multithread.examples;

/**
 * Name : PrintThread
 * <br>
 * Description :
 * <br>
 * Date : 31/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class PrintThread extends Thread {

    private int sleepTime;

    public PrintThread(String name) {
        // sleep between 0 and 5 seconds
        sleepTime = (int) (Math.random() * 5000);
        System.out.println("Name: " + getName() + "  sleep: " + sleepTime);
    }

    public synchronized int syncMethod(int x) {
        return 0;
    }

    public void run() {
        System.out.println(getName() + " going to sleep");
        try {
            Thread.sleep(sleepTime);
        } catch(InterruptedException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(getName() + " done sleeping");
    }

}
