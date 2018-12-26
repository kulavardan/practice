package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map m1=new LinkedHashMap();
		m1.put(1,100);
		m1.put(2,200);
		m1.put(5,500);
		m1.put(6,600);
		m1.put(7,700);
		m1.put(3,300);
		m1.put(4,400);
		//m1.remove(2);
		System.out.println(m1);
        Set s=m1.keySet();
        Iterator itr=s.iterator();
        
        while(itr.hasNext())
        {
        	Object kobj=itr.next();
        	Object vobj=m1.get(kobj);
        	System.out.println(kobj+"="+vobj);
        }
//        for(Object test:s)
//        {
//        	System.out.print(test);
//        }
	}

}
