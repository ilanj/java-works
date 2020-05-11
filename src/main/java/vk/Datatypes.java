package vk;

import java.util.Scanner;

import static vk.AccessModifiers.*;

public class Datatypes
{

    static int a=20; //static variable
    int b=30;
    public static Datatypes d=new Datatypes();
    public static void main(String[] args)
    {
        Data d1=new Data();
        Scanner in=new Scanner(System.in);
        int a; //local variable
        a=10;
        System.out.println(Datatypes.a);

        System.out.println(d.b);

        int result;

        a=10;

        result=add(Data.op1,Data.op2);
        System.out.println("sum="+result);
        result=d.sub(Data.op1,Data.op2);
        System.out.println("diff="+result);
        result=d.mul(d1.op3,d1.op4);
        System.out.println("product="+result);
        result=d.div(d1.op3,d1.op4);
        System.out.println("division="+result);
        d.print();

    }

    static int add(int a1,int a2)
    {

        return a1+a2;
    }
    int sub(int s,int d)
    {
       return s-d;
    }
    int mul(int h,int j)
    {
       return h*j;
    }
    int div(int j,int f)
    {
       return j/f;
    }
    void print()
    {
        System.out.println(a);
        System.out.println(b);
    }


}
