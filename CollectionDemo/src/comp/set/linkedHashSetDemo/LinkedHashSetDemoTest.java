package comp.set.linkedHashSetDemo;

import java.util.LinkedHashSet;

import comp.arrayListDemo.Student;

/**
 * @author PachputeJayesh
 *LinkedHashSet:-
 		Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. 
 		It inherits HashSet class and implements Set interface.
 		Duplicate elements are not allowed.
		Allows single null values.
		insertion order is maintained.
		Implements set interface.
		LinkedHashSet class is non synchronized
 */
public class LinkedHashSetDemoTest {

	public static void main(String[] args) {
		
		LinkedHashSet<Student> linkedHSStudent = new LinkedHashSet<Student>();
		
		Student s1 = new Student(1, "Ramesh", 45.5f);
		Student s2 = new Student(2, "Suresh", 35.5f);
		Student s3 = new Student(3, "Kamlesh", 85.5f);
		Student s4 = new Student(4, "Kamlesh", 85.5f);
		
		linkedHSStudent.add(s1);
		linkedHSStudent.add(s2);
		linkedHSStudent.add(s3);
		linkedHSStudent.add(s4);
		linkedHSStudent.add(s4);
		linkedHSStudent.add(null);
		linkedHSStudent.add(null);
		
		linkedHSStudent.forEach(s->System.out.println(s));
		
		System.out.println("===================================");
		
		linkedHSStudent.add(new Student(1, "Ramesh", 45.5f));
		linkedHSStudent.add(new Student(2, "Suresh", 35.5f));
		linkedHSStudent.add(new Student(3, "Kamlesh", 85.5f));
		linkedHSStudent.add(new Student(4, "Kamlesh", 85.5f));
		
		linkedHSStudent.forEach(s->System.out.println(s));
		
	}

}
