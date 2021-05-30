package collections.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Name : HasSetExample
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class HasSetExample {
    public static void main(String args[]) {
        //declare a set class (HashSet)
        Set<String> hs = new HashSet<>();
        //add an element => add
        hs.add("Hello");
        hs.add("From");
        hs.add("HashSet");
        hs.add("Collection");

        //print the set
        System.out.println("Original Set (hs):" + hs);
        //size()
        System.out.println("hs Size:" + hs.size());

        Set<String> subHashSet = new HashSet<>();
        subHashSet.addAll(Arrays.asList("Hello", "Collection"));
        //print the set
        System.out.println("subHashSet contents:" + subHashSet);
        //contains ()
        System.out.println("Is hs contains element Hello ? " + hs.contains("Hello"));
        //containsAll ()
        System.out.println("Is hs contains collection subHashSet ? " +
                hs.containsAll(subHashSet));

        // retainAll () => intersection
        Set<String> set_intersection = new HashSet<>(hs);
        set_intersection.retainAll(subHashSet);

        System.out.print("Intersection of the hs & subHashSet:");
        System.out.println(set_intersection);

        // removeAll () => difference
        Set<String> set_difference = new HashSet<>(hs);
        set_difference.removeAll(subHashSet);

        System.out.print("Difference of the hs & subHashSet:");
        System.out.println(set_difference);

        // addAll () => union
        Set<String> set_union = new HashSet<>(hs);
        set_union.addAll(subHashSet);

        System.out.print("Union of the hs & subHashSet:");
        System.out.println(set_union);
    }
}