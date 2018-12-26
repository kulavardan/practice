package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorDemo {
	
	public static void main(String[] args) {
		/**
		 * comparable can be used, when you hava a probability to edit the class (Here laptop) 
		 * Here we have implemented comparable<Laptop> in laptop class.
		 * But in case of external libraries where you can't add data into their files , Because they are .class files
		 * In that case we go for Comparable 
		 * And if you want to specify which parameter you want to sort directly,  we go for comparator
		 * 
		 * Here we have both implementation , 
		 * execution purpose commenting comparable code in this class and Laptop class
		 */
		
		List<Laptop> laptop= new ArrayList<Laptop>();
		laptop.add(new Laptop("samsung",400,1000));
		laptop.add(new Laptop("apple",600,2000));
		laptop.add(new Laptop("mi",300,3000));
		
		/*Collections.sort(laptop);
		laptop.forEach(i->System.out.println(i));*/
		
		Comparator<Laptop> com=new Comparator<Laptop>()
		{

			public int compare(Laptop o1, Laptop o2) {
				
				/*if(o1.getRam()>o2.getRam())
					return 1;
				else if(o1.getRam()<o2.getRam())
					return -1;
					else
				return 0;*/
				return o1.getRam()-o2.getRam();
				
				
			}

		};
		laptop.forEach(i->System.out.println(i));
		Collections.sort(laptop, com);
		
		laptop.forEach(i->System.out.println(i));
	}

}
