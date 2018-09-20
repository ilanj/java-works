package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetClass {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();

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
