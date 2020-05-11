package programs.basicprograms;
//calculator
public class MethodsDemo {
    public static void main(String[] args)
    {
        MethodsDemo m=new MethodsDemo();
        m.add();
        m.sub(50,20);
        System.out.println("product="+m.product());
        System.out.println("division="+m.division(45,89));
    }
    //without return value and without arguments
     void add()
    {
        int a=10,b=20;
        System.out.println("sum="+(a+b));
    }
    //without return value and with arguments
    void sub(int a,int b)
    {
        System.out.println("difference="+(a-b));
    }
    //with return value and without arguments
    int product()
    {
        int a=10,b=20;
        return (a*b);
    }
    //with return value and with arguments.
    double division(double a,double b)
    {
        return (a/b);
    }
}
