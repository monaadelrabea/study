package collections.examples;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Name : ArrayBlockingQueueExample
 * <br>
 * Description :
 * <br>
 * Date : 30/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class ArrayBlockingQueueExample {
    public static void main(String args[]) {

        ArrayBlockingQueue<Double> arrayBlockingQueue =
                new ArrayBlockingQueue<>(40);
        arrayBlockingQueue.add(3.3);
        arrayBlockingQueue.add(2.2);
        arrayBlockingQueue.add(5.5);
        arrayBlockingQueue.add(4.4);
        arrayBlockingQueue.add(7.7);
        
        System.out.println("arrayBlockingQueue.peek() :" + (arrayBlockingQueue.peek() != null && arrayBlockingQueue.peek() == 3.3));
        System.out.println("arrayBlockingQueue.remove() :" + (arrayBlockingQueue.remove() == 3.3));
        System.out.println("arrayBlockingQueue.remove() :" + (arrayBlockingQueue.remove() == 2.2));
        System.out.println("arrayBlockingQueue.peek() :" + (arrayBlockingQueue.peek() != null && arrayBlockingQueue.peek() == 5.5));
        System.out.println("arrayBlockingQueue.size() :" + (arrayBlockingQueue.size() == 3));

    }
}
