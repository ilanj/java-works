package advanced.threading;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class CheckTimeJava8 {
    static CheckTimeJava8 obj=new CheckTimeJava8();

    public static void main(String[] args)
    {
        System.out.println("starting now");

        new Thread(CheckTimeJava8::method1).start();
        new Thread(()->method2()).start();
        new Thread(()->method3()).start();
    }

    static void method1() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(new Exception().getStackTrace()[0].getMethodName());
    }

    static void method2()  {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(new Exception().getStackTrace()[0].getMethodName());
    }

    static void method3()  {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(new Exception().getStackTrace()[0].getMethodName());
    }

}
