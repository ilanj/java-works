package oops.thisandsuper;

public class ThisConstructor {
    String name;
    int rollNo;

    ThisConstructor()
    {
        System.out.println("constructor without parameter");
    }

    ThisConstructor(String name)
    {
        System.out.println(" constructor with one param name="+name);
    }
    ThisConstructor(int rollNo,String name)
    {
        this(name);
        this.rollNo=rollNo;
        this.name=name;

    }
    void display()
    {
        System.out.println(this.name+"  "+rollNo);
    }

    public static void main(String[] args) {
        ThisConstructor t=new ThisConstructor(25,"ila");
        t.display();
    }
}
