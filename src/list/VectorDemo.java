package list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector V= new Vector();
		//Vector V= new Vector(100);
		//Vector V= new Vector(100,5);
		V.addElement(10);
		V.addElement(100);
		V.addElement(40);
		V.addElement(50);
		System.out.println("capacity is " +V.capacity()+" Size is "+V.size());
		
//	---------------------------------------------	
//		//Iterator itr=V.iterator();
////		while(itr.hasNext())
////		{
////			System.out.println(itr.next());
////		}
//	
//	------------------------------------------------
		Enumeration e=V.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
	}

}
