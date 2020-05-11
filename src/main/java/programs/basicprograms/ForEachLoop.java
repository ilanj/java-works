package programs.basicprograms;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        int n;
        n= RandomUtils.nextInt(5,50);
        for(int i=0;i<n;i++)
            a.add(UUID.randomUUID().toString());

      a.forEach(System.out::println);
      a.forEach(ss->method1(ss));
      a.forEach(sdh->method1());
//       a.forEach(s->method1(s));
       a.forEach(d->method1());
//       a.forEach(ForEachLoop::method1);
//        a.forEach(System.out::println);
    }
    static void method1(String s)
    {
        System.out.println(s.replace("-",""));
    }
    static void method1()
    {
        System.out.println("empty method");
    }

}
