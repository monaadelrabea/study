package collections.examples;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Name : PriorityQueueExample
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class PriorityQueueExample {
    public static void main(String args[]) {
        // Creating empty priority queue 
        PriorityQueue<String> pq = new PriorityQueue<>();
        // add elements to pq using add()
        pq.add("1");
        pq.add("2");
        pq.add("3");
        pq.add("4");
        pq.add("5");
        pq.add("6");

        // Print the head element using Peek () method 
        System.out.println("Head element using peek method: " + pq.peek());

        // Printing all elements 
        System.out.println("The PriorityQueue elements: ");

        Iterator iter1 = pq.iterator();
        while (iter1.hasNext())
            System.out.print(iter1.next() + " ");

        // remove head with poll () 
        pq.poll();
        System.out.println("\nAfter removing an element with poll function:");
        for (String s : pq) System.out.print(s + " ");

        // Remove '6' using remove ()
        pq.remove("6");
        System.out.println("\nElement '6' with remove function:");

        for (String s : pq) System.out.print(s + " ");

        // Check if an element is present in PriorityQueue using contains() 
        System.out.println("\nIs Priority queue contains 4 ? " + pq.contains("4"));

        // get array equivalent of PriorityQueue with toArray () 
        Object[] numArr = pq.toArray();
        System.out.println("Array Contents: ");
        for (Object o : numArr)
            System.out.print(o.toString() + " ");
    }
}

