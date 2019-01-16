package advanced.lambdas;

public class OneThread {
    public static void main(String[] args) throws InterruptedException {
        /*any method has 4 things
        1.name  2.parameter  3.body  4.return type
        but a lambda has only
        1.parameter and 2.body
        ()-when lambda has no parameter put empty paranthesis
         */
        new Thread(()->{
           for(int i=0;i<10;i++)
               System.out.println(i*i*i);
        }).start();
//        Thread.sleep(1);
        for(int i=0;i<10;i++)
        {
            if(i==5)
                Thread.sleep(2500);
            System.out.println("outside lambda"+i*i*i);

        }

    }
}
