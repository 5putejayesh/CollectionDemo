package comp.stackDemo;

import java.util.Stack;

/**
 * @author PachputeJayesh
 * Stack :-
 		The stack is a linear data structure that is used to store the collection of objects.
 		It is based on Last-In-First-Out (LIFO). 
 		Allows duplicate elements.
 		Allows null values.
 		
 		
 */
public class StackDemoTest {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(10);
		st.push(15);
		st.push(20);
		st.push(25);
		st.push(30);
		st.push(30);
		st.push(null);
		st.push(null);
		
		st.forEach(s->System.out.println(s));
	}

}
