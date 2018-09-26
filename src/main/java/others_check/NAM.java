package others_check;

public class NAM {
    //instance( Non access modifiers)- abstract, static, final
    int a=10;
    static int b=20;
    private final int c=30;

    public static void main(String[] args) {

        NAM n=new NAM();

        n.a=n.a*10;
        System.out.println(n.a);

        b=b*10;
        System.out.println(b);

        System.out.println(n.c);


    }
}
