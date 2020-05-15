package collections.others;
/*Priority queue does not have any ends.
In a priority queue, elements can be inserted in any order but removal of the elements is in a sorted order.
Due to this behavior, a priority queue can be used to sort the elements.

Since sorting is done only when the elements are removed from the priority queue,
the PQ is easily implemented by a heap.
*/
//peekLast and pollLast arent supported
import java.util.PriorityQueue;

public class PriorityQueueCollection {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(56);
        p.add(78);
        p.add(100);
        p.add(56);
        p.add(2569);
        p.add(54);

        System.out.println(p);
        System.out.println(p.peek());//return head
        System.out.println(p);

        System.out.println(p.poll());////returns and remove head
        System.out.println(p);

        System.out.println(p);

    }
}
