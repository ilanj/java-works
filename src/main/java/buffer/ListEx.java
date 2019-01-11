package buffer;

import java.util.*;
import java.util.stream.Collectors;

public class ListEx {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Set<Integer> nos=new TreeSet<>();
//        ArrayList<Integer> al=new ArrayList<>();

        nos.add(45);
        nos.add(56);
        nos.add(78);
        nos.add(89);
        nos.add(23);
        nos.add(78);
        nos.add(1);

        List<Integer> temp=nos.stream().filter(el->el>50).collect(Collectors.toList());
        System.out.println(temp);

        nos.remove(4);
        System.out.println(nos);

//        Iterator itr=nos.iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }


//        for(int i=0;i<nos.size();i++)
//        {
//            System.out.println(nos.get(i));
//        }

//        for(Integer n:nos)
//        {
//            System.out.println(n);
//        }

    }
}
