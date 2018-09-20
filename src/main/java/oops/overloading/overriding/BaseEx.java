package oops.overloading.overriding;

public class BaseEx extends DerivedEx {
    void message()
    {
        System.out.println("this is printed inside baseclass which inherited parent");
    }

    public static void main(String[] args) {
        DerivedEx obj=new BaseEx();//upcasting
        obj.message();
    }
}
