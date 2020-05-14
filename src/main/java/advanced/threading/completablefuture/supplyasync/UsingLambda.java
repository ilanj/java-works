//get() method is blocking. It waits until the Future is completed and
//returns the result
package advanced.threading.completablefuture.supplyasync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class UsingLambda {
    static CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()->{
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "I was called first";
    });
    static CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->{
        return "I was called second";
    });

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("calling");
    System.out.println(future1);
    System.out.println(future2);
//        System.out.println(future1.isDone());
//        System.out.println(future1.getNow("------"));
// get() method is blocking waits until the Future is completed and returns the result
    System.out.println(future1.get());
    System.out.println(future2.get());

        System.out.println("called");
    }
}
