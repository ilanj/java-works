package oops.overloading.overriding;

public class DerivedEgx extends BaseEgx {
    void message()
    {
        System.out.println("this is printed inside derived class which inherited baseclass");
    }

    void kcbjhc()
    {

    }

    public static void main(String[] args) {

        DerivedEgx obj=new DerivedEgx();
        obj.message();

//        DerivedEgx d=new BaseEgx();    -will throw an error

        BaseEgx b=new DerivedEgx();//upcasting//run-time polymorphism//late-binding
        b.message();

    }
}
