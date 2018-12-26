package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOrOdd {
	public static void main (String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. to find whether Even or Odd");
		
		int n = Integer.parseInt(br.readLine());
		if(n%2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
			}

}
