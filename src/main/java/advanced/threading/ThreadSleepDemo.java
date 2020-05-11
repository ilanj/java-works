package advanced.threading;

public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world");
        ThreadSleepDemo t=new ThreadSleepDemo();
        t.message1();
        t.message2();
        t.message3();
    }
    static void message1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(new Exception().getStackTrace()[0].getMethodName());
    }
    void message2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(new Exception().getStackTrace()[0].getMethodName());
    }
    void message3() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(new Exception().getStackTrace()[0].getMethodName());
    }

}
