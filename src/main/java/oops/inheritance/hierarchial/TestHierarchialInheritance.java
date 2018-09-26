package oops.inheritance.hierarchial;

public class TestHierarchialInheritance {
    public static void main(String[] args) {
        DerivedOne d1=new DerivedOne();
        d1.sq(d1.getInput());


        DerivedTwo dt=new DerivedTwo();
        dt.cube(dt.getInput());


    }
}
