package collections;

import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
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

    }
}
