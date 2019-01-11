package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {
    public static void main(String[] args) {
        Map<String,Integer> h=new TreeMap<>();//maintains ascending order unlike hashmap

        h.put("ilan",25);
        h.put("Amit",61);
        h.put("bala",102);
        h.put("riyaz",13);

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
    }
}
