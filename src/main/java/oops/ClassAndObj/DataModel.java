package oops.ClassAndObj;

public class DataModel
{
    int a=10;
    int b=10;
    int c=10;
    int d=10;
    int e=10;
    String name="haai welcome";
     double f=125.36;

    public static void main(String[] args)
    {
        DataModel obj=new DataModel();
        DataModel obj1=new DataModel();

        System.out.println("obj="+obj.a+"  "+obj.name+"  "+obj.f);
        System.out.println("obj="+obj1.a+"  "+obj1.name+"  "+obj1.f);


        obj.a=1711;
        System.out.println(obj1.a);

        Run r=new Run();
        //r.print(obj);
    }
}
