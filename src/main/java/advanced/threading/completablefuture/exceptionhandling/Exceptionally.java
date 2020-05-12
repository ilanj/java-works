package advanced.threading.completablefuture.exceptionhandling;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Exceptionally {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Integer age = null;

        CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
            if(age < 0) {
               return "Error";
            }
            if(age > 18) {
                return "Adult";
            } else {
                return "Child";
            }
        }).exceptionally(ex -> {
            System.out.println("Oops! We have an exception - " + ex.getMessage());
            return "Unknown!";
        });

        System.out.println("Maturity : " + maturityFuture.get());
    }
}
