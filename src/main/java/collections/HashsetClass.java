package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashsetClass {
    public static void main(String[] args) {
        Set<Integer> h=new HashSet<>();

        h.add(45);
        h.add(58);
        h.add(96);
        h.add(58);
        h.add(45);
        h.add(1);

        Iterator i=h.iterator();
        while ((i.hasNext()))
            System.out.println(i.next());
    }
}
