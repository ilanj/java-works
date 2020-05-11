package oops.thisandsuper;

public class ThisBasic extends BaseClassEg{
    String name="i am a instance variable";

    void ThisBasic()
    {
        String name="I am a local variable inside method";
        System.out.println(super.name);

    }

    public static void main(String[] args) {

        ThisBasic t=new ThisBasic();
        t.ThisBasic();

    }
}
