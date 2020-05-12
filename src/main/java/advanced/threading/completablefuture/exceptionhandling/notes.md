<h3> Exception Handling for Cmpletable Future </h3>

```CompletableFuture.supplyAsync(() -> {
	// Code which might throw an exception
	return "Some result";
}).thenApply(result -> {
	return "processed result";
}).thenApply(result -> {
	return "result after further processing";
}).thenAccept(result -> {
	// do something with the final result
});```

___If an error occurs in the original supplyAsync() task, then none of the thenApply() 
callbacks will be called and future will be resolved with the exception occurred. 
If an error occurs in first thenApply() callback then 2nd and 3rd callbacks won’t be 
called and the future will be resolved with the exception occurred, and so on.___

Exception Can be Handled using 
1. exceptionally()
2. handle()