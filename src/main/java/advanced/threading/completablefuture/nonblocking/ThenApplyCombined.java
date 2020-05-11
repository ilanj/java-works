package advanced.threading.completablefuture.nonblocking;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThenApplyCombined {
    static CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        return "Rajeev";
    }).thenApply(name -> {
        return "Hello " + name;
    }).thenApply(greeting -> {
        return greeting + ", Welcome to the CalliCoder Blog";
    });

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(welcomeText.get());
    }
}
