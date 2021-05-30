package collections.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Name : ThreeClassesImplementList
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class ThreeClassesImplementList {
    public static void main(String args[]) {
        // Interface name: List
        // Three classes that implement the List interface:
        List<String> aList = new ArrayList<String>();
        List<String> elList = new LinkedList<String>();
        List<String> sharedList = new Vector<String>();
        // All three have an add method
        aList.add("in array list");
        elList.add("in linked list");
        sharedList.add("in vector");

        // All three have a get method
        System.out.println("in array list" + aList.get(0));
        System.out.println("in linked list" + elList.get(0));
        System.out.println("in vector" + sharedList.get(0));
    }

}

