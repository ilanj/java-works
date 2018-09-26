package oops.inheritance.single;

public class Derived extends Base{
    void cube(int x)
    {
        System.out.println("in derived"+(x*x*x));
    }

    public static void main(String[] args) {
        Derived d=new Derived();
        System.out.println(d.a);
        d.sq(10);
        d.cube(10);
    }
}
