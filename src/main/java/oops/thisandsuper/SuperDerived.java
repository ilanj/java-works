package oops.thisandsuper;

public class SuperDerived extends  SuperBase{

    double fee=2222.2222;
    void message()
    {
        System.out.println("advace java course fee="+fee);
    }

    void print()
    {
        int fee=500;
        System.out.println(fee);
        System.out.println(this.fee);
        System.out.println(super.fee);

        this.message();
        super.message();

    }

    public static void main(String[] args) {
        SuperDerived s=new SuperDerived();
        s.print();


    }
}
