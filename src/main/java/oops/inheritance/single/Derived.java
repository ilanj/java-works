package oops.inheritance.single;

public class Derived extends Base {
    int b;


    public static void main(String[] args) {


        Derived d=new Derived();

        System.out.println(d.b);

        d.cube_ud(5);

        System.out.println(d.a);
        d.sq(10);

    }
    void cube_ud(int x)
    {
        System.out.println("in derived"+(x*x*x));
    }
}
