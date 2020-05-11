<h1> Supply Async </h1>
CompletableFuture.supplyAsync() return a result after completion.  
takes a Supplier<T> and returns CompletableFuture<T> where T is the type of 
the value obtained by calling the given supplier.