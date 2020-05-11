###### <h1> Java Completable Future </h1>
`https://www.callicoder.com/java-8-completablefuture-tutorial/`
_CompletableFuture is used for asynchronous programming in Java. Asynchronous programming 
is a means of writing non-blocking code by running a task on a separate thread than the 
main application thread and notifying the main thread about its progress, completion or 
failure._

**Limitations of Future** (Future is previous version of Completable Future)
_It cannot be manually completed 
You cannot perform further action on a Future’s result without blocking
Multiple Futures cannot be chained together
You can not combine multiple Futures together
No Exception Handling_

**Pre Requisite**
You can create a CompletableFuture simply by using the following no-arg constructor -
* CompletableFuture<String> completableFuture = new CompletableFuture<String>();

result of this CompletableFuture can call
* String result = completableFuture.get()

You can use CompletableFuture.complete() method to manually complete a Future -
* completableFuture.complete("Future's Result")
