package collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Name : ArrayListExample
 * <br>
 * Description :
 * <br>
 * Date : 27/05/2021
 * <br>
 * Create by : Mona Adel
 * <br>
 * Mail : mona.adel@afaqy.com
 */
public class ArrayListExample {
    public static void main(String args[]) {

        List<String> names = new ArrayList<String>();
        names.add("Hello");
        names.add("From");
        names.add("ArrayList");
        names.add("Collection");

        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);


    }
}


