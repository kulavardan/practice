package list;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection4 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("sai");
		al.add("ramesh");
		al.add("shiva");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("sandeep");
		al2.add("bejju");
		al.addAll(al2);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
