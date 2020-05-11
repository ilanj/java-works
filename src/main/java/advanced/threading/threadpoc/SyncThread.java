package advanced.threading.threadpoc;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SyncThread {
    static List<Model> l=new ArrayList<>();
//    static Model m=new Model();

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<200;i++)
        {

            new Thread(()->
            {
                print();
            }).start();
        }
        Thread.sleep(5000);
        print1();

    }

    static void print()
    {
//        m=new Model(LocalTime.now(),UUID.randomUUID().toString().substring(0,4),UUID.randomUUID().toString().substring(0,4));
        Model m=new Model(LocalTime.now(),"cc","d");
        m.setTime1(LocalTime.now());
        m.setTime2(UUID.randomUUID().toString().substring(0,4));
        m.setTime3(UUID.randomUUID().toString().substring(0,4));
        l.add(m);
        System.out.println();
//        Model m=new Model();
    }

    static  void print1()
    {
        l.forEach(element-> System.out.println(element.getTime2()));
    }

}
