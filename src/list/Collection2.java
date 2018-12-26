package list;

import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sai");
		al.add("bintu");
		al.add("kumar");
		al.add("goud");
		//Iterator<String> itr=al.iterator();
		for(String obj:al)
		{
			System.out.println(obj);//using for each loop
		}
	}

}


