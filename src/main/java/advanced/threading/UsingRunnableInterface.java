package advanced.threading;

public class UsingRunnableInterface implements  Runnable{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);


        }

    }

}
