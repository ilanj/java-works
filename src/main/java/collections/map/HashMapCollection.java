package collections.map;

import org.apache.commons.lang3.ObjectUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {

        Map<Integer,String> h=new HashMap<>();

        h.put(null,"Vijay");
        h.put(null,"Vijhhay");
        h.put(101,"Vijay");
        h.put(100,"dupl");
        h.put(102,"Rahul");
        h.put(15,"Rahul");
        h.put(150,"Rahul");

        /* using iterator
        Iterator<Map.Entry<Integer, String>> it = h.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<Integer,String> pair=it.next();
            System.out.println(pair.getKey()+"  "+pair.getValue());
        }*/

        // java8-foreach
h.keySet().stream().filter(ke->ke.equals("102"));
        h.forEach((k,v)-> System.out.println(k+"-->"+v));

//        for(Map.Entry pair:h.entrySet())
//            System.out.println(pair.getKey()+"   "+pair.getValue());

       h.remove(100);
        System.out.println(h);
    }
}
