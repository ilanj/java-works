package oops.constructor.basicconstructor;

public class EgDef {
    int n=10;
    String name="ilanchezhian";
/* this constructor is not explicitly written, but this is how compiler understands
    public EgDef() {
    }
*/
    public static void main(String[] args) {

        EgDef e=new EgDef();
        System.out.println(e.n);
        System.out.println(e.name);

    }
}
