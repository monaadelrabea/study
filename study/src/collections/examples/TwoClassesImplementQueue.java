package collections.examples;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Name : TwoClassesImplementQueue
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class TwoClassesImplementQueue {
    public static void main(String args[]) {
        // Creating empty  queue 
        Queue<String> pq = new PriorityQueue<>();
        Queue<String> adq = new ArrayDeque<>();

        // add elements to pq using add()
        pq.add("in Priority Queue 1");
        pq.add("in Priority Queue 2");
        adq.add("in Array Deque 1");
        adq.add("in Array Deque 2");


        System.out.println("pq : " + pq);
        System.out.println("adq : " + adq);
    }

}

