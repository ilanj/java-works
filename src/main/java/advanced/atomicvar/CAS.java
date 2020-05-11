package advanced.misc;
//compare and swap
//https://www.javaworld.com/article/2078848/java-concurrency-java-101-the-next-generation-java-concurrency-without-the-pain-part-2.html?page=3
import java.util.concurrent.atomic.AtomicLong;

public class CAS {
    public static void main(String args[])
    {

        // Initially value as 0
        AtomicLong val = new AtomicLong(0);

        // Prints the updated value
        System.out.println("Previous value: "
                + val);

        // Checks if previous value was 0
        // and then updates it
        boolean res = val.compareAndSet(0, 6);

        // Checks if the value was updated.
        if (res)
            System.out.println("The value was "
                    + "updated and it is "
                    + val);
        else
            System.out.println("The value was "
                    + "not updated");
    }
}