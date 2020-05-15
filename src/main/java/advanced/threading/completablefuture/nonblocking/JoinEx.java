/*The CompletableFuture.join() method is similar to the get method, but it throws
 an unchecked exception in case the Future does not complete normally. This makes
  it possible to use it as a method reference in the Stream.map() method.
 */
package advanced.threading.completablefuture.nonblocking;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class JoinEx {
   static CompletableFuture<String> getName = CompletableFuture.supplyAsync(()->{
       String exMethodCall = getText();
       try {
           TimeUnit.SECONDS.sleep(3);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       return exMethodCall;
   });

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> greet = getName.thenApply(returnValue->{
            return null;
        });
//        System.out.println(greet);
        System.out.println(greet.join());
    }
    static String getText(){
        return UUID.randomUUID().toString();
    }
}
