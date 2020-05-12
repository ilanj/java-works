package advanced.threading.completablefuture.combiningcf.combinemultiple;

import advanced.threading.completablefuture.combiningcf.thencompose.UserModel;
import advanced.threading.completablefuture.combiningcf.thencompose.UserService;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class AllOf {

    static CompletableFuture<String> downloadWebPage(String pageLink) {
        return CompletableFuture.supplyAsync(() -> {
            // Code to download and return the web page's content
            return "returned "+pageLink;
        });
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> webPageLinks = Arrays.asList("one", "two", "three");
        // Download contents of all the web pages asynchronously
        List<CompletableFuture<String>> pageContentFutures = webPageLinks.stream()
                .map(webPageLink -> downloadWebPage(webPageLink))
                .collect(Collectors.toList());
        // Create a combined Future using allOf()
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(
                pageContentFutures.toArray(new CompletableFuture[pageContentFutures.size()])
        );
        CompletableFuture<List<String>> allPageContentsFuture = allFutures.thenApply(v -> {
            return pageContentFutures.stream()
                    .map(pageContentFuture -> pageContentFuture.join())
                    .collect(Collectors.toList());
        });
        // Count the number of web pages having the "CompletableFuture" keyword.
        CompletableFuture<Long> countFuture = allPageContentsFuture.thenApply(pageContents -> {
            return pageContents.stream()
                    .filter(pageContent -> pageContent.contains("e"))
                    .count();
        });

        System.out.println("Number of Web Pages having e keyword - " +
                countFuture.get());
        System.out.println();

    }

}
