package oops.overloading;

public class Sum {
    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println(s.add(10,30,23));
    }


    int add(int x,int y)
    {
        System.out.println("you called first sum");
        return  x+y;
    }
    int add(int x,int y,int z)
    {
        System.out.println("you called sec sum");

        return x+y+z;
    }
    double add(double x,int y)
    {
        System.out.println("you called third sum");
        return x+y;
    }

}
