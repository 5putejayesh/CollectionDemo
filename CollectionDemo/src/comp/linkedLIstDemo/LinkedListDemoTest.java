package comp.linkedLIstDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import comp.arrayListDemo.Student;

/**
 * @author PachputeJayesh
 *			Growable in nature.
 *			Allows duplicate elements.
			Allows null values.
			insertion order is maintained.
			Implements List interface.
			Random access as it works on index basis.
			Manipulation(insertion and deletion) is faster than Arraylist as it is node based.
 */
public class LinkedListDemoTest {

	public static void main(String[] args) {
		
		LinkedList<Student> al =new LinkedList<Student>();
		
		Student s1 = new Student(1, "Ramesh", 45.5f);
		Student s2 = new Student(2, "Suresh", 35.5f);
		Student s3 = new Student(3, "Kamlesh", 85.5f);
		Student s4 = new Student(4, "Kamlesh", 85.5f);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(1,s4);
		
		System.out.println("By Using For Each loop");
		for(Student i:al){
			System.out.println(i);
		}
		
		System.out.println("By Using Lambda Expression");
		al.forEach((i)->{System.out.println(i);});
		
		LinkedList<Student> al1 =new LinkedList<Student>();
		
		Student s5 = new Student(5, "Rupesh", 50.5f);
		Student s6 = new Student(6, "Mangesh", 65.5f);
		
		al1.add(s5);
		al1.add(s6);
		
		al.addAll(al1);
		
		System.out.println("Merging two ArrayLists:");
		
		al.forEach((i)->{System.out.println(i);});
		
		System.out.println(al.contains(23));
		System.out.println(al.containsAll(al1));
			
		al.forEach(i->System.out.println(i));
		
		Iterator<Student> i=	al.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		ListIterator<Student> litr=al.listIterator();
		
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		
		System.out.println(al);
	}

}
