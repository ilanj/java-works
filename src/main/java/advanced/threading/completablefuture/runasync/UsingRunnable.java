package advanced.threading.completablefuture.runasync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class UsingRunnable {
    // Run a task specified by a Runnable Object asynchronously.
    static CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
        @Override
        public void run() {
            // Simulate a long-running Job
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("I'll run in a separate thread than the main thread.");
        }
    });
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("gonna call");
        System.out.println(future.get());
        System.out.println("called");
    }

}
