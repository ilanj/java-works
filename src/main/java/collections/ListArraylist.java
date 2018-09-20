package collections;

import java.util.*;

public class ListArraylist
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the method u wanna call");
        String choice = in.next();
        choice = choice.toLowerCase();

        if (choice.contains("array"))
            arrayList();
        else if (choice.contains("link"))
            linkedList();
        else
            System.out.println("enter a valid choice");
    }




    static void arrayList()
    {
        List<Integer> l=new ArrayList<>();
        l.add(15);
        l.add(75);
        l.add(9);
        l.add(10);
        //int x=Collections.min(l);
        System.out.println("min="+Collections.min(l));
        System.out.println("max="+Collections.max(l));
//
        Iterator i=l.iterator();
        while (i.hasNext())
            System.out.println(i.next());
//
        for(int temp:l)
            System.out.println(temp);

        System.out.println("after sort");
        Collections.sort(l);
        System.out.println(l);

        System.out.println("after sort");
        Collections.reverse(l);
        System.out.println(l);
    }

    static void linkedList()
    {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(15);
        l.add(75);
        l.add(9);
        l.add(10);
        l.addFirst(5);
        l.addLast(58);

        System.out.println("min="+Collections.min(l));
        System.out.println("max="+Collections.max(l));
//
        Iterator i=l.iterator();
        while (i.hasNext())
            System.out.println(i.next());
//
        for(int temp:l)
            System.out.println(temp);

        System.out.println("after sort");
        Collections.sort(l);
        System.out.println(l);

        System.out.println("after sort");
        Collections.reverse(l);
        System.out.println(l);

        System.out.println("inserting at begining");

        System.out.println(l);
        l.remove(0);
        l.remove(0);
        l.remove(0);
        System.out.println(l);
    }

}
