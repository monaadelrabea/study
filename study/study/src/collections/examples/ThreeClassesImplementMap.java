package collections.examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Name : ThreeClassesImplementMap
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class ThreeClassesImplementMap {

    public static void main(String args[]) {
        // Interface name: Map
        // Three classes that implement the Map interface:
        Map<String, String> hm = new HashMap();
        Map<String, String> lHm = new LinkedHashMap<>();
        Map<String, String> tm = new TreeMap<>();

        // All three have an put method
        hm.put("hm", " in hash map");
        lHm.put("lHm", " in Linked Hash Map ");
        tm.put("tm", " in Tree Map");


        System.out.println("hm " + hm);
        System.out.println("lHm" + lHm);
        System.out.println("tm " + tm);

    }
}


