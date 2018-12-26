package map;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap tm=new TreeMap();
		tm.put("FTD", 9030);
		tm.put("India",9849);
		tm.put("DG",9490);
		
		Set s=tm.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			
			Object cname=itr.next();
			Object Number=tm.get(cname);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
			System.out.println(cname+" phone number is"+Number);
		}
		
		Scanner sc=new Scanner(System.in);
		String user=sc.nextLine();
		Object phno=tm.get(user);
		if(phno	!=null)
		{
			System.out.println(user+" phone number is "+phno);
		}
		else
		{
			System.out.println("phone number doesn't exist");
		}
		
		

	}

}
