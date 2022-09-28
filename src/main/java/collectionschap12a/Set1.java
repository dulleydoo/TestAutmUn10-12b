package collectionschap12a;
import java.util.HashSet;
import java.util.Set;
public class Set1 {
    public static void main(String[] args) {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //4
        System.out.println(fruit); //[banana, orange, apple, lemon]
    }
}
/* methods available to set
add - adds an object to the collection

clear - removes all objects from collection

contains - returns true if a specified object is
an element within the collection

isEmpty - returns true if the collection has no
element

iterator - returns an iterator object for the
collection, which may be used to retrieve an object

remove - removes a specified object from the collection

size - returns the number of elements in the collection

 */

