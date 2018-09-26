package advanced.threading;
/*  44
down vote

In Java 8 you can do this with one line of code.

If your method doesn't take any parameters, you can use a method reference:

new Thread(MyClass::doWork).start();

Otherwise, you can call the method in a lambda expression:

new Thread(() -> doWork(someParam)).start();

*/
public class Check {
    public static void main(String[] args) {
        new Thread(Check::loop).start();
        new Thread(Check::loop1).start();
        new Thread(()->loop3()).start();


    }
     static void loop()
     {
         for(int i=0;i<10;i++)
         {
             try {
                 Thread.sleep(0);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(Thread.currentThread().getName()+"  "+i);


         }
     }
    static void loop1()
    {
        for(int i=4587;i<4600;i++)
        {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"  "+i);


        }
    }

    static void loop3()
    {
        String c="qwkdvqwjdqdjeqd";
        char[] ch=c.toCharArray();
        for (char ch1 : ch) {
            System.out.println(Thread.currentThread().getName()+"  "+ch1);

        }

    }
}
