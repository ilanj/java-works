/* thenApply() is executed in the same thread where the supplyAsync() task is executed, or in the
main thread if the supplyAsync() task completes immediately (try removing sleep() call to verify).

To have more control over the thread that executes the callback task, you can use async callbacks.
If you use thenApplyAsync() callback, then it will be executed in a different thread obtained from
ForkJoinPool.commonPool()
*/
package advanced.threading.completablefuture.nonblocking;

import java.util.concurrent.*;

public class ThenApplyAsync {
    static CompletableFuture<String> getName = CompletableFuture.supplyAsync(()->{
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
        }
        System.out.println(Thread.currentThread().getName());
        return " world!";
    });
    static Executor executor = Executors.newFixedThreadPool(2);
    static CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
        System.out.println(Thread.currentThread().getName());
        return "Some result";
    },executor);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        CompletableFuture<String> greet = getName.thenApplyAsync(returnValue->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            return "Hello" + returnValue;
        });
        System.out.println(greet.get());
        CompletableFuture<String> greet1 = future2.thenApplyAsync(returnValue->{
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            return "Hello" + returnValue;
        });
        System.out.println(greet1.get());

    }
}
