package map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		m1.put(1,100);
		m1.put(5,200);
		m1.put(2, 300);
		m1.put(4,200);
		m1.put(6, 300);
		m1.remove(4);
		System.out.println(m1);
        Set s=m1.keySet();
        Iterator itr=s.iterator();
        
        while(itr.hasNext())
        {
        	Object kobj=itr.next();
        	Object vobj=m1.get(kobj);
        	System.out.println(kobj+"="+vobj);
        }
	}

}
