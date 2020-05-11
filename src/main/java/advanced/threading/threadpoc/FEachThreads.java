package advanced.threading.threadpoc;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class FEachThreads {
    static Integer normalCounter = 0;
    static AtomicInteger atomicCounter = new AtomicInteger();

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        AtomicInteger counter = new AtomicInteger();
        for(int i=0; i<100; i++){
//            al.add(ThreadLocalRandom.current().nextInt(20,852));
//            counter.incrementAndGet();
            al.add(i);        }
       al.forEach(n->{
           new Thread(()-> incCounter()).start();
       });
        al.forEach(n->{
            new Thread(()-> decCounter()).start();
        });
        System.out.println(normalCounter);
        al.forEach(n->{
            new Thread(()-> incAtomicCounter()).start();
        });
        al.forEach(n->{
            new Thread(()-> decAtomicCounter()).start();
        });
        System.out.println(atomicCounter.toString());
    }

    static int printSquare(int n){
//        System.out.println(n*n);
        return normalCounter++;
    }
    static void incCounter(){
        ++normalCounter;
    }
    static void decCounter(){
        --normalCounter;
    }
    static void incAtomicCounter(){
        atomicCounter.incrementAndGet();
    }
    static void decAtomicCounter(){
        atomicCounter.decrementAndGet();
    }
}
