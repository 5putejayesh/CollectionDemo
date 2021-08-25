package comp.set.treeSetDemo;

import java.util.TreeSet;


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
 * 	TreeSet:- 
 * 			Java TreeSet class implements the Set interface that uses a tree for storage.
 			Duplicate elements are not allowed.
 			Doesn't allow null element.
 			Sorted one.
 			insertion order is not maintained.
 			Java TreeSet class access and retrieval times are quiet fast.
 			Java TreeSet class maintains ascending order.
 			It force us to implement comparable interface.

 */
public class TreeSetDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Ramesh", 45.5f);
		Student s2 = new Student(2, "Suresh", 35.5f);
		Student s3 = new Student(3, "Kamlesh", 85.5f);
		Student s4 = new Student(4, "Kamlesh", 85.5f);
		
		TreeSet<Student> hs= new TreeSet<Student>();
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s4);
		
		hs.forEach(s->System.out.println(s));

	}

}
