package oops.inheritance.multilevel;

public class Derived2 extends Derived1 {
    int c=30;

    void powerFour(int x)
    {
        System.out.println("inside derived2 x power 4 = "+(x*x*x*x));
    }

    public static void main(String[] args) {
        Derived2 obj=new Derived2();
        obj.cube(2);
    }
}
