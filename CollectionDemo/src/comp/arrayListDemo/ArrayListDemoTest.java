package comp.arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @author PachputeJayesh
 *Collection:-
 *			is used to store and manipulate objects.
 *
 *ArrayList:-
 *			growable in nature.
 *			Allows duplicate elements.
			Allows null values.
			insertion order is maintained.
			Implements List interface.
			Random access as it works on index basis.
			
			Manipulation(insertion and deletion) is slow because lot of shifting needs to be done. 
			This means that if the ArrayList has 1000 elements and we remove 
			the 50th element, then the 51st element tries to acquire that 50th position 
			and likewise all elements. So, moving every element consumes a lot of time.
			
			Methods:-
					1.add(object)
					2.clear
					3.add(index,object)
					4.size
					5.get->returns object from specified position.
			
			
 */
public class ArrayListDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student(1, "Ramesh", 45.5f);
		Student s2 = new Student(2, "Suresh", 35.5f);
		Student s3 = new Student(3, "Kamlesh", 85.5f);
		Student s4 = new Student(4, "Kamlesh", 85.5f);
		
		ArrayList<Student> al =new ArrayList<Student>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		al.add(1,s4);
		
		System.out.println("By Using FGor Each loop");
		for(Student i:al){
			System.out.println(i);
		}
		
		System.out.println("By Using Lambda Expression");
		al.forEach((i)->{System.out.println(i);});
		
		ArrayList<Student> al1 =new ArrayList<Student>();
		
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
		System.out.println("===============================");
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
		System.out.println("===============================");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		
		System.out.println(al);
	}

}
