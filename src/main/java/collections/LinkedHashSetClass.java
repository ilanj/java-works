package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
//LinkedHashSet-maintains insertion order unlike HashSet
public class LinkedHashSetClass {
    public static void main(String[] args) {
        LinkedHashSet<Integer> h=new LinkedHashSet<>();

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
