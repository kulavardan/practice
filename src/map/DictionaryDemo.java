package map;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryDemo {

	public static void main(String[] args) {
		
		Dictionary<Integer,String> d=new Hashtable<Integer,String>();//as dictionary is absract class , we can not instantiate
		d.put(1,"Sai");
		d.put(2,"bintu");
		d.put(5,"dimpu");
		d.put(null, "hello");
		d.put(null, "hello");
		
		System.out.println(d);
		
		Enumeration s=d.keys();
		while(s.hasMoreElements())
		{
			//System.out.println(s.nextElement());
			Object num=s.nextElement();
			Object name=d.get(num);
			System.out.println(name);
		}
		

	}

}
