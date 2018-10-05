package variavles;

import vk.AccessModifiers;

public class VariablesDemo {
    int i;//instance variables
    static int j;
    final int k=40;


    public static void main(String[] args)
    {
        VariablesDemo v=new VariablesDemo();
      int j=10;//local variable
        System.out.println(j);
        System.out.println(v.i);
        System.out.println(v.k);
        v.add();
    }

       void add()
    {
        System.out.println("this is add method");
        VariablesDemo v=new VariablesDemo();
        System.out.println(j);
        System.out.println(i);
        System.out.println(k);
        System.out.println("public a="+ AccessModifiers.public_a);
    }
}
