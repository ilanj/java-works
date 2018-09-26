package advanced.threading;

public class UsingThreadClass extends Thread {
    private String threadName;
    private Thread t;

    public static void main(String[] args) throws InterruptedException {

        UsingThreadClass t = new UsingThreadClass("ttttt");
        t.start();
        System.out.println(t.getName());
        UsingThreadClass t1 = new UsingThreadClass("fffffff");
        t1.start();
        //t.start();
        System.out.println("daadafadfadfad");
        // t1.start();
        System.out.println(t1.getName());


    }

    UsingThreadClass(String name) throws InterruptedException {
        for (int j = 0; j < 10; j++) {
            Thread.sleep(200);
            System.out.println(j);
        }

    }


    static void check() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("edeff");
        for (int j = 0; j < 10; j++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(j);
        }
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
