package comp.map.linkedHashMap;

import java.util.LinkedHashMap;

/**
 * @author PachputeJayesh LinkedHashMap:- Java LinkedHashMap class is Hashtable
 *         and Linked list implementation of the Map interface. It inherits
 *         HashMap class and implements the Map interface. Insertion order is
 *         maintained. Java LinkedHashMap may have one null key and multiple
 *         null values.
 * 
 */
public class LinkedHashMapDemoTest {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(1, "Hello");
		hm.put(3, "bingo");
		hm.put(2, "Mingo");

		// duplicate values are allowed
		// null values are allowed.
		hm.put(4, "Mingo");
		hm.put(5, null);
		hm.put(6, null);

		// duplicate keys are not allowed.
		// null keys are allowed.

		hm.put(7, "Nishant");
		hm.put(7, "Mangesh");
		hm.put(null, "John");
		hm.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
