/*
add(element): Adds an element to the tail.
addFirst(element): Adds an element to the head.
addLast(element): Adds an element to the tail.
offer(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
offerFirst(element): Adds an element to the head and returns a boolean to explain if the insertion was successful.
offerLast(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
iterator(): Returna an iterator for this deque.
descendingIterator(): Returns an iterator that has the reverse order for this deque.
push(element): Adds an element to the head.
pop(element): Removes an element from the head and returns it.
removeFirst(): Removes the element at the head.
removeLast(): Removes the element at the tail.
poll(): Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
pollFirst(): Retrieves and removes the first element of this deque, or returns null if this deque is empty.
pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.
peek(): Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
peekFirst(): Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
peekLast(): Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
 */
package collections.others;

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
