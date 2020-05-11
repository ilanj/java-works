package advanced.threading.completablefuture.nonblocking;
/* thenRun() doesn’t even have access to the Future’s result. It takes a Runnable
 and returns CompletableFuture<Void> -
 */

import java.util.concurrent.CompletableFuture;

public class ThenRun {
    static CompletableFuture<Void> future = CompletableFuture.supplyAsync(()->{
        System.out.println("inside future's supply async");
        return null;
    });

    public static void main(String[] args) {
        future.thenRun(()->{
            System.out.println(" I am in than run");
        });
    }
}
