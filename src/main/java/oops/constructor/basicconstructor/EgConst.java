package oops.constructor.basicconstructor;

public class EgConst {
    int x;
    int y;

    EgConst()
    {
        System.out.println(" constructor is called");
    }
    EgConst(int a,int b)
    {
        System.out.println("parameterized constructor is called");
        x=a;
        y=b;
    }
    EgConst(EgConst eg)
    {
        x=eg.x;
        y=eg.y;
    }

    void showData()
    {
        System.out.println("x="+x);
        System.out.println("y="+y);

    }


    public static void main(String[] args) {

 //       EgConst e=new EgConst();

        EgConst e2=new EgConst(25,33);
        EgConst copycon=new EgConst(e2);
        copycon.showData();
//
//        EgConst e=new EgConst(6,10);
//        e.showData();
//
//        EgConst aa=new EgConst(78,89);
//        aa.showData();
//
//        EgConst e1=new EgConst(aa);
//        e1.showData();
    }
}
