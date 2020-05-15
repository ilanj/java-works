<h3> thenApply </h3>
accepts an argument of type T and produces a result of type R 

<h3> thenAccept and thenRun </h3>
If you don’t want to return anything from your callback function and just 
want to run some piece of code after the completion of the Future, then you 
can use thenAccept() and thenRun() methods.