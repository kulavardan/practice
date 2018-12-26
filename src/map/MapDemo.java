package map;

import java.util.Map;
import java.util.HashMap;
public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(100, "sai");
		mp.put(102, "demo");
		mp.put(101, "bintu");
		
		
		
		for(Map.Entry m:mp.entrySet())
		{
			System.out.println(m.getKey()+" ,"+m.getValue());
		}
		

	}

}
