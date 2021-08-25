package comp.arrayListDemo;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Ramesh", 45.5f);
		Student s2 = new Student(2, "Suresh", 35.5f);

		ArrayList<Student> al = new ArrayList<Student>();

		al.add(s1);
		al.add(s2);
		
		ListIterator<Student> litr=al.listIterator();
		
		System.out.println(litr.nextIndex());
		System.out.println(litr.next());
		System.out.println(litr.nextIndex());
		System.out.println(litr.next());
		System.out.println(litr.nextIndex());
		System.out.println(litr.previousIndex());
		System.out.println(litr.previous());
	}

}
