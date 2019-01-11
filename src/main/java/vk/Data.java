package vk;

import oops.encapsulation.StudentDetail;

public class Data {
    static int op1=25;
    static int op2=35;

    int op3=45;
    int op4=58;

    public static void main(String[] args)
    {

        System.out.println("op1="+op1);
        System.out.println("op2="+op2);
        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(AccessModifiers.name1);



    }

    public static StudentDetail studentAdd(StudentDetail s)
    {

        System.out.println(s);
        return s;
    }
}
