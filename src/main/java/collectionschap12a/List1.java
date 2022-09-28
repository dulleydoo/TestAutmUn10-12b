package collectionschap12a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class List1 {
    public static void main(String[] args) {
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); //banana
        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
    }
}
/* methods of ArrayList
add(int index, Object obj) - inserts obj into list
at position of index

addAll(int index, Collection c) - inserts all elements
pf c into the list at position of index

get(int index) - returns the object stored at the specified
index within the invoking collection

index(Object obj) - returns true if the collection
has no elements

lastIndexOf(Object obj) - returns the index of the
last instance of obj in the list

remove(int index) - removes the element at position index
and returns deleted element

set(int index, Object obj) - Assigns obj to the location
specified by index within the invoking list

subList(int start, int end) - returns a list containing elements
from start to end
 */
