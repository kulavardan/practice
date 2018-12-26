 package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();//gives the result in ascending order
		ts.add("Sai");
		ts.add("Bintu");
		ts.add("Kumar");
		ts.add("Goud");
		ts.add("Goud");
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}


