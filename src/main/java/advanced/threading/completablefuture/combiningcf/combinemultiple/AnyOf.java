/*returns a new CompletableFuture which is completed when any of the given CompletableFutures complete
CompletableFuture.anyOf() takes a varargs of Futures and returns CompletableFuture<Object>.
The problem with CompletableFuture.anyOf() is that if you have CompletableFutures that return
results of different types, then you won’t know the type of your final CompletableFuture.
 */
package advanced.threading.completablefuture.combiningcf.combinemultiple;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class AnyOf {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of Future 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            String creatingException = null;
            if(creatingException.equals("test"))
                return creatingException;
            return creatingException;

        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of Future 3";
        });

        CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3).whenCompleteAsync((res,ex)->{
            System.out.println(res);
            System.out.println(ex);
        });

        System.out.println(anyOfFuture.get()); // Result of Future 2
        TimeUnit.SECONDS.sleep(3);

        System.out.println(anyOfFuture.get()); // Result of Future 2
        System.out.println(anyOfFuture.get()); // Result of Future 2
        System.out.println(anyOfFuture.get()); // Result of Future 2
        System.out.println(anyOfFuture.get()); // Result of Future 2
        System.out.println(anyOfFuture.get()); // Result of Future 2
    }
}
