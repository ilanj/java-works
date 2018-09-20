package collections.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableCollection {
    public static void main(String[] args) {
        Map<Integer,String> h=new Hashtable<>();

        h.put(101,"Vijay");
        h.put(100,"dupl");
        h.put(102,"Rahul");
        h.put(104,"Amit");
        h.put(100,"wdd");

        /* using iterator
        Iterator<Map.Entry<Integer, String>> it = h.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,String> pair=it.next();
            System.out.println(pair.getKey()+"  "+pair.getValue());
        }*/
        /* java8-foreach
        h.forEach((key,value) -> System.out.println(key + " = " + value));
        */

        for(Map.Entry pair:h.entrySet())
            System.out.println(pair.getKey()+"   "+pair.getValue());

        h.remove(100);
        System.out.println(h);
    }
}
