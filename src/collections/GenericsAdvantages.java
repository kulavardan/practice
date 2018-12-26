package collections;

import java.util.ArrayList;

public class GenericsAdvantages {

	public static void main(String[] args) {
		
		/**
		 * Below arraylist is non generic 
		 * So you can add any type as data below as there are no restrictions , Hence it is not type safe
		 */
		ArrayList al=new ArrayList();
		al.add("Sai");
		al.add(10);
		al.add(true);
		
		System.out.println(al);
		
		//String str=al.get(0); Here you can not retrieve the data into string as it is of object type
		String str=(String)al.get(0);
		/**
		 * Since it is non generic ,we need to perform type casting as above
		 */
		System.out.println(str);
		
		/**
		 * Generics advantages
		 * 1)To achieve type safety
		 * 2)To resolve type casting problem
		 * Below one is a generic collection example
		 */
		
		ArrayList<String> generic=new ArrayList<String>();
		
		generic.add("sai");
		//genric.add(1);here we will get compile time error since it is having type as string
		generic.add("bintu");
		
		String str1=generic.get(0);
		/**
		 * Here you no need to perform any type casting 
		 */
		

	}

}
