package collections.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Name : ThreeClassesImplementSet
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class ThreeClassesImplementSet {

    public static void main(String args[]) {
        // Interface name: Set
        // Three classes that implement the Set interface:
        Set<String> hs = new HashSet<>();
        Set<String> lHs = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();

        // All three have an add method
        hs.add("in hash set");
        lHs.add("in Linked Hash Set ");
        ts.add("in Tree Set");


        System.out.println("hs" + hs);
        System.out.println("lHs" + lHs);
        System.out.println("ts" + ts);

    }
}


