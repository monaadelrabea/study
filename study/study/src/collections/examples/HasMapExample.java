package collections.examples;

import java.util.HashMap;
import java.util.Map;

/**
 * Name : HasMapExample
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class HasMapExample {

    public static void main(String args[]) {
        //declare a map class (HashMap)
        Map<String, String> hm = new HashMap<>();

        //add an element => add
        hm.put("1", "Hello");
        hm.put("2", "From");
        hm.put("3", "HashMap");
        hm.put("4", "Collection");
        hm.put("nullValue", null);
        hm.put(null, null);
        hm.put(null, "test");

        //print the map
        System.out.println("Original Map (hm):" + hm);
        //size()
        System.out.println("hm Size:" + hm.size());

        Map<String, String> subHashMap = new HashMap();
        subHashMap.put("5", "subHello");
        subHashMap.put("2", "From");

        //print the subHashMap
        System.out.println("subHashMap contents:" + subHashMap);

        // putAll()
        hm.putAll(subHashMap);

        //size()
        System.out.println("Is hm Size after putAll 7? " + (hm.size() == 7));

        //get ()
        System.out.println("Is hm contains element value with key null ? " + hm.get("nullKey"));
        System.out.println(hm.get("nullValue") == null);

        //containsKey ()
        System.out.println("Is hm contains key  5 ? " + hm.containsKey("5"));

        //containsValue()
        System.out.println("Is hm contains Hello  ? " + hm.containsValue("Hello"));

        //containsValue()
        System.out.println("Is hm contains null  ? " + hm.containsKey(null));

        hm.remove("nullValue");

        //size()
        System.out.println("Is hm Size after remove 6 ? " + (hm.size() == 6));
        System.out.println("Value after remove ? " + hm);
    }

}
