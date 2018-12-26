package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>();//Linked Hashset will give same order as you provided
		hs.add("Sai");
		hs.add("bintu");
		hs.add("kumar");
		hs.add("sai");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}


