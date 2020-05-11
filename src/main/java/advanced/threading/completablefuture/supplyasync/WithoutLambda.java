package advanced.threading.completablefuture.supplyasync;

import demo.Str;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class WithoutLambda {
    // Run a task specified by a Supplier object asynchronously
    static CompletableFuture<String> future1 = CompletableFuture.supplyAsync(new Supplier<String>() {
        @Override
        public String get() {
            return "I was called second";
        }
    });
    static CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
        @Override
        public String get() {
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "I was called first , Result of the asynchronous computation";
        }
    });

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("gonna call");
        System.out.println(future.get());
        System.out.println(future1.get());
        System.out.println("called");
    }

}

