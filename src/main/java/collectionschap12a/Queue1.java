package collectionschap12a;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
            Queue fruit = new LinkedList();
            fruit.add("apple");
            fruit.add("lemon");
            fruit.add("banana");
            fruit.add("orange");
            fruit.add("lemon");

            System.out.println(fruit.size()); //5
            System.out.println(fruit);//[apple, lemon, banana, orange, lemon]

            fruit.remove();
        System.out.println(fruit);//[lemon, banana, orange, lemon]
        System.out.println(fruit.peek());//lemon
    }
}
/*Queue methods
add - adds elements to the tail of the queue

peek - used to view the head of the queue without removing it.
returns false if queue is empty

element - similar to peek() but throws exceptions
if queue is empty

remove - removes and returns the head of the queue.
Throws exception if queue is empty.

poll - similar to remove(), but returns null if queue
is empty
 */
