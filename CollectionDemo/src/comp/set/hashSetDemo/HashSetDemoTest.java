package comp.set.hashSetDemo;

import java.util.HashSet;

import comp.arrayListDemo.Student;

/**
 * @author PachputeJayesh
 * Set:-	
 *			A set is used to store the collection of elements without duplicates.
 			It is an unordered collection which means that order is not maintained 
 			A set cannot be iterated by using ListIterator but by Iterator.
 			
There are four classes which implement Set interface:
			HashSet
			LinkedHashSet
			TreeSet
			SortedSet - It uses hash table to store elements. Duplicates are not allowed.
 * 
 * 	HashSet:- 
 * 			Java HashSet class is used to create a collection that uses 
 * 				a hash table for storage.	
 * 			Growable in nature.
 *			Duplicate elements are not allowed.
			Allows single null values.
			insertion order is not maintained.
			Implements set interface.
			HashSet class is non synchronized
			Elements are inserted on the basis of their hashcode.
			HashSet is the best approach for search operations.
			The initial default capacity of HashSet is 16, and the load factor is 0.75.

 */
public class HashSetDemoTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Ramesh", 45.5f);
		Student s2 = new Student(2, "Suresh", 35.5f);
		Student s3 = new Student(3, "Kamlesh", 85.5f);
		Student s4 = new Student(4, "Kamlesh", 85.5f);
		
		HashSet<Student> hs= new HashSet<Student>();
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s4);
		
		hs.forEach(s->System.out.println(s));
		

	}

}
