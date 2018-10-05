package oops.thisandsuper;


//        this can be used to refer current class instance variable.
//        this can be used to invoke current class method (implicitly)
//        this() can be used to invoke current class constructor.

public class ThisEg {
    int no;
    String name;

    ThisEg(int no,String name){
        this.no=no;
        this.name=name;
        this.display(); //implicit call using this without creating object
    }

    void display()
    {
        System.out.println("you have called display method");
        System.out.println(no+" "+name);
    }

    public static void main(String[] args) {
ThisEg t=new ThisEg(25,"ila");
t.display();
    }
}
