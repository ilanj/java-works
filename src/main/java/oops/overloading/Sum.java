package oops.overloading;

public class Sum {
    public static void main(String[] args) {

        Sum s=new Sum();
        System.out.println(s.sum(10.4545121,20));
    }
    int sum(int x,int y)
    {
        System.out.println("you called first sum");
        return  x+y;
    }
    int sum(int x,int y,int z)
    {
        System.out.println("you called sec sum");

        return x+y+z;
    }
    double sum(double x,int y)
    {
        System.out.println("you called third sum");
        return x+y;
    }
}
