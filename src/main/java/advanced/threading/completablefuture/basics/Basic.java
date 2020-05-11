package advanced.threading.completablefuture.basics;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Basic {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.complete("manually ended");
        System.out.println(completableFuture.get());
    }
}
