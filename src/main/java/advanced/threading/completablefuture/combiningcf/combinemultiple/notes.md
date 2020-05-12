<h3> Combining multiple CompletableFutures together </h3>
We used thenCompose() and thenCombine() to combine two CompletableFutures together. 
Now, what if you want to combine an arbitrary number of CompletableFutures? Well, 
you can use the following methods to combine any number of CompletableFutures -

_static CompletableFuture<Void>	 allOf(CompletableFuture<?>... cfs)
static CompletableFuture<Object> anyOf(CompletableFuture<?>... cfs)_

<h4> 1. CompletableFuture.allOf() - (Void)</h4>
CompletableFuture.allOf is used in scenarios when you have a List of independent 
futures that you want to run in parallel and do something after all of them are complete,
this dosen't return anything.

Let’s say that you want to download the contents of 100 different web pages of a website. 
You can do this operation sequentially but this will take a lot of time. 

<h4> 2. CompletableFuture.anyOf() </h4>
CompletableFuture.anyOf() as the name suggests, returns a new CompletableFuture which is 
completed when any of the given CompletableFutures complete, with the same result.

<h4> whenComplete(), whenCompleteAsync() </h4>
 CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3).whenComplete((res,ex)->{
            System.out.println(res);
            System.out.println(ex);
        });
 If exception occurs, res is null and ex will store exception
 When this stage is complete, the given action is invoked with 
 the result (or null if none) and the exception (or null if none) 