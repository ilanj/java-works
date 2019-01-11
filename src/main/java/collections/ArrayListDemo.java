package collections;

import demo.Print;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        al.add(23);

        al.add(10);
        al.add(58);
        al.add(100);
        al.add(58);
        al.add(100);
        al.add(98);
        al.add(98);


        if(al.contains(100))
            System.out.println("100 is present");
//        al.add(3,25);
//        al.add(2,12545);
        System.out.println("----------------"+al.get(1));
        System.out.println(al);
        al.remove(3);
        System.out.println(al);

//        for(int i=0;i<al.size();i++)
//            System.out.println(al.get(i));
        al.forEach(ex->System.out.println(ex));
//        System.out.println(al);
//        al.remove(2);
////        System.out.println(al);
//
//        al.add(85);
//        al.add(45);
//
//        System.out.println("mmin="+ Collections.min(al));
//        System.out.println("max="+Collections.max(al));
//        Collections.sort(al);
//        Collections.reverse(al);
//
//        al.forEach(b->{
//            System.out.println(b*2);
//
//        });
//
////        for(int a:al)
////            System.out.println("using for "+a);
////
////        Iterator it=al.iterator();
////        while(it.hasNext())
////        {
////            System.out.println("using iterator "+it.next());
////        }
////
//       // al.forEach(System.out::println);





    }
}
