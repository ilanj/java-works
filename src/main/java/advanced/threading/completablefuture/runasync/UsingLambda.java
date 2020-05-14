package advanced.threading.completablefuture.runasync;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class UsingLambda {
    // Using Lambda Expression


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
            printMessage(" I was called second");
        });
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            // Simulate a long-running Job
//            try {
//                TimeUnit.SECONDS.sleep(3);
//            } catch (InterruptedException e) {
//                throw new IllegalStateException(e);
//            }
            printMessage("I was called first and I'll run in a separate thread than the main thread.");
        });


        System.out.println("gonna call");
        System.out.println(future2.get());
        System.out.println(future1.get());
        System.out.println("called");
    }

    static void printMessage(String message){
        System.out.println(message);
    }

}

