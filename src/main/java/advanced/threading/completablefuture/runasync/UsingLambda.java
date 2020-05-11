package advanced.threading.completablefuture.runasync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class UsingLambda {
    // Using Lambda Expression
    static CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
        System.out.println(" I was called second");
    });
    static CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
        // Simulate a long-running Job
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        System.out.println("I was called first and I'll run in a separate thread than the main thread.");
    });
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("gonna call");
        System.out.println(future.get());
        System.out.println(future1.get());
        System.out.println("called");
    }

}

