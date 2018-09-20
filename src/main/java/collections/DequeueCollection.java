package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DequeueCollection {
    public static void main(String[] args) {
        Deque<Integer> p=new ArrayDeque<>();
        p.add(56);
        p.add(78);
        p.add(100);
        p.add(56);
        p.add(54);

        System.out.println(p);
        System.out.println(p.peek());//return head
        System.out.println(p);

        System.out.println(p.poll());////returns and remove head
        System.out.println(p);

        System.out.println(p.peek());
        System.out.println(p);
//peek and peekfirst are same
        //poll and pollfirst  are same
        System.out.println("peeklast"+p.peekLast());
        System.out.println(p);

        System.out.println("poll last"+p.pollLast());
        System.out.println(p);

    }
}
