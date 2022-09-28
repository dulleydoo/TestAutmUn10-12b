package collectionschap12a;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size()); //4
        System.out.println(fruitCalories);//{banana=105, orange=45, apple=95, lemon=17}

        System.out.println(fruitCalories.get("lemon"));//17

        System.out.println(fruitCalories.entrySet());//[banana=105, orange=45, apple=45, lemon=17]

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);


    }
}
/*Map methods
clear() - removes all key/value pairs from the map

containsKey(Object key) - returns true if the map
contains ana element that has key

containsValue(Object value) - returns true if the map
contains an element that has value

entrySet() - returns a set that contains the enteries
in the map

get(Object key) - returns the value associated with the key

isEmpty() - returns true if the map is empty. otherwise
return false.

keySet() - returns a set that contains the keys in the map

Put(Object key, Object value) - Puts an entry in the map,
overwriting any previous value associated with the key

putAll(Map m) - puts all the entries form m into this map

putIfAbsent(Object key, Object value) - puts an entry
in the map if the key does not already exist

remove(Object key) - removes the entry whose key equals key




 */
