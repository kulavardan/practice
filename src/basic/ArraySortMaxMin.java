package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraySortMaxMin {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No. of Array Elements to Enter");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		System.out.println("Ener "+n+" Elements of an Array");
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(br.readLine());
		for(int i=0;i<n-1;i++) {
			for(int j=i;j<n-1;j++) {
				if(a[i] > a[j]){
					a[j]=a[i]+a[j];
					a[i]=a[j]-a[i];
					a[j]=a[j]-a[i];
					}
				
				
				}
			
		}for(int j=0;j<n;j++)
			System.out.print(a[j]+" ");
		
	}

}
