//thenCompose() is used to combine two Futures where one future is dependent on the other
package advanced.threading.completablefuture.combiningcf.thencompose;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenCompose {
    static CompletableFuture<UserModel> getUsersDetail(String userId) {
        return CompletableFuture.supplyAsync(() -> {
            return UserService.getUserDetails(userId);
        });
    }

    static CompletableFuture<Double> getCreditRating(UserModel user) {
        return CompletableFuture.supplyAsync(() -> {
            return CreditRatingService.getCreditRating(user);
        });
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Double> result = getUsersDetail("36")
                .thenCompose(user -> getCreditRating(user));
//        CompletableFuture<Double> result = getUsersDetail("36").
//                thenApply(user -> {
//                    try {
//                        return getCreditRating(user).get();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (ExecutionException e) {
//                        e.printStackTrace();
//                    }
//                    return null;
//                });
        System.out.println(result.get());
        System.out.println();
    }
}
