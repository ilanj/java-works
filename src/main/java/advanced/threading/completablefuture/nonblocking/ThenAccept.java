package advanced.threading.completablefuture.nonblocking;

import demo.Str;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenAccept {
    static CompletableFuture<Void> future1 = CompletableFuture.supplyAsync(()->{
        return "testing then accept and then run";
    }).thenAccept(result->{
        System.out.println(result+" fro future1");
    });

    static CompletableFuture<String> future2 = CompletableFuture.supplyAsync(()->{
        return "testing then accept and then run";
    });
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        future1.get();
        future2.thenAccept(result->{
            System.out.println(result+ "from future2");
        });
    }
}
