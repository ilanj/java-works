package advanced.lambdas;

import java.util.Arrays;
import java.util.List;

public class TwoList {
    public static void main(String[] args) {
        List<String> nos= Arrays.asList("1","2","3","4","5","6","7");
        System.out.println(nos);

        nos.forEach(System.out::print);
        System.out.println();
       // nos.stream().map(e->Integer.parseInt(e)).forEach(e-> System.out.println(e+e));
//        nos.stream().map(Integer::parseInt).forEach(e-> System.out.println(e+e));
        int sum=nos.stream().map(Integer::parseInt).reduce(0,(a,b)->(a+b));
        String s=nos.stream().reduce("",(s1,s2)->(s1+s2));
        System.out.println(sum);
        System.out.println(s);

        // nos.stream().forEach(e-> System.out.println(e+e));//prints as string


    }
}
