package oops.thisandsuper;

public class ThisConstructor {
    String name;
    int rollNo;
    ThisConstructor(String name)
    {
        System.out.println(" name="+name);
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
