package comp.map.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author PachputeJayesh
 *Map:-
		A map is used to store the key-value pair.
		It doesn't allow duplicate keys but duplicate values are allowed.
		Each key and value pair is known as an entry.
		A Map is useful if you have to search, update or delete elements on the basis of a key.
		
		
	It has the following concrete subclasses:
		HashMap
		WeakHashMap
		HashTable
		IdentityHashMap
		TreeMap
		LinkedHashMap
		
HashMap:-
		A HashMap is class which implements the Map interface.
		For adding elements in HashMap we use the put method.
		It is unordered, which means that the key must be unique.
		It may have null key-null value.
		Hash map for primitive data type is not allowed.
		Insertion order is not maintained.
		The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 */
public class HashMapDemoTest {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(1,"Hello");
		hm.put(2,"bingo");
		hm.put(3,"Mingo");

		//duplicate values are allowed
		//null values are allowed.
		hm.put(4,"Mingo");
		hm.put(5,null);
		hm.put(6,null);
		
		
		
		//duplicate keys are not allowed.
		//null keys are allowed. 
		
		hm.put(7,"Nishant");
		hm.put(7,"Mangesh");
		hm.put(null,"John");
		
		hm.forEach(( k, v)->System.out.println(k+" "+v));
		
		//to retrive all values.
		
		Collection<String> s=hm.values();
		
		for (String t:s)
				System.out.println(t);
		
		//to retrive all keys.
		Set<Integer> k=hm.keySet();
		for(Integer i:k)
			System.out.println(i+" "+hm.get(i));
		
		//to retrive all entries (pair of key and value).
		
		Set<Map.Entry<Integer,String>> entrySet=hm.entrySet();
		
		for(Map.Entry<Integer, String> t:entrySet)
				System.out.println(t.getKey()+" "+t.getValue());
		
		for(Map.Entry<Integer, String> m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
