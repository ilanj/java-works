package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//no duplication and ascending
public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> h=new TreeSet<>();

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
