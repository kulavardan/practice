package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 extends Object{

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("foo");
		al.add("bar");
		al.add("bizz");
		al.add("fizz");
		al.add(1,"baz");
		al.add(al.size(),"Ftd");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
