package programs.basicprograms;

import java.util.Scanner;

public class MethodEx {
    int a=40;//instance variable
    static int b=20;
    final int c=30;
    public static void main(String[] args)
    {
        //int b=10;//local variable
        //Classname obj=new Classname();
        Scanner in=new Scanner(System.in);
        MethodEx m=new MethodEx();
        m.a=m.a*2;
        System.out.println(m.a);
        b=b*2;
        System.out.println(b);

        System.out.println("a="+m.c);
        int a,b;
        System.out.println("enter a");
        a=in.nextInt();
        System.out.println("enter b");

        b=in.nextInt();
        System.out.println(MethodEx.print(a,b));
    }
    String add()
    {
        int a=10;
        int b=20;
        int c;
        c=a+b;
        return "qehdgedgedug";
    }
    static int print(int a,int b)
    {

        int c=a+b;
        return c;
    }

}
