package singletonclass;

public class SingletonPractice {
    static SingletonPractice sp=null;
    String s;

    private SingletonPractice()
    {
        s="first value";
    }
    public static SingletonPractice getInstance()
    {
       if(sp==null)
        sp=new SingletonPractice();
        return sp;
    }

    public static void main(String[] args) {
        SingletonPractice a=SingletonPractice.getInstance();
        SingletonPractice b=SingletonPractice.getInstance();
        SingletonPractice c=SingletonPractice.getInstance();
        b.s="second value";
        System.out.println(a.s);
        System.out.println(b.s);
        System.out.println(c.s);




    }
}
