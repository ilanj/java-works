package oops.thisandsuper;

public class ThisBasic {
    String name="i am a instance variable";

    ThisBasic()
    {
        String name="I am a local variable inside method";
        System.out.println(this.name);

    }
    public static void main(String[] args) {

        ThisBasic t=new ThisBasic();

    }
}
