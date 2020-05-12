//If there is an exception, res will be null and ex will store the exception
//And vice versa
package advanced.threading.completablefuture.exceptionhandling;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Handle {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Integer age = 20;
        Integer age = null;

        CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
            if(age < 0) {
                return "Err";
            }
            if(age > 18) {
                return "Adult";
            } else {
                return "Child";
            }
        }).handle((res, ex) -> {
            if(ex != null) {
                System.out.println("Oops! We have an exception - " + ex.getMessage());
                return "Unknown!";
            }
            return res;
        });

        System.out.println("Maturity : " + maturityFuture.get());
    }
}
