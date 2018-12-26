package collections;

import java.util.LinkedList;

public class ListIterator {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sai");
		ll.add("bintu");
		ll.add("test123");
		ll.addFirst("first");
		ll.addLast("last");
		java.util.ListIterator<String> li=ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("  ");
		while(li.hasPrevious())
		{
			
			System.out.println(li.previous());
		}
		

	}

}
