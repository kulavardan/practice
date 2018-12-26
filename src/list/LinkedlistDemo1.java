package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo1 {

	public static void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sai");
		ll.add("bintu");
		ll.add("test123");
		ll.addFirst("first");
		ll.addLast("last");
		Boolean b=ll.contains("test");
		String first=ll.getFirst();
		String last=ll.getLast();
		System.out.println(first);
		System.out.println(last);
		System.out.println(b);
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
