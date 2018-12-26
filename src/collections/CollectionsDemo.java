package collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("a1 : "+al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		Collections.replaceAll(al, 30, 60);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
	}

}
