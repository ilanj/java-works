package advanced.threading;

public class MainThreadClass {
    public static void main(String args[]) {
        UsingRunnableInterface myRunnable = new UsingRunnableInterface();
        Thread t = new Thread(myRunnable);
        t.start();
        Thread t1= new Thread(myRunnable);
        t1.start();

    }
}