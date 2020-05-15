/*
Vector is synchronized, whereas access to an ArrayList is not.
What this means is that only one thread can call methods on a Vector at a time
The Stack class extends Vector
https://www.geeksforgeeks.org/vector-vs-arraylist-java/
 */
package collections.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.addElement("Practice");
        v.addElement("quiz");
        v.addElement("code");

        // traversing elements using Enumeration
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

        v.forEach(System.out::println);
    }
}
