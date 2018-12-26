package list;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(10);
		s.push(100);
		s.push(10000);
		System.out.println(s);
		System.out.println(s.pop());
//		s.push(10000);
//		s.push(10000);
		s.peek();
		//System.out.println(s.search(105));
		System.out.println(s.peek());
		System.out.println(s);
		Enumeration E=s.elements();
		while (E.hasMoreElements())
		{
			System.out.println(E.nextElement());
		}
		

	}

}
