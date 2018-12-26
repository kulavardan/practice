package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pascal {

		
	public static void main(String[] args) throws Exception {
		int i, j, k = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of rows to print in pascal triangle");
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int b[] = new int[n];
		for (i = 1; i <= n; i++) {
			System.out.print(" ");
			a[0] = a[i - 1] = 1;

			for (j = 0; j < i; j++) {
				if (j == 0 || j == (i - 1)) {
					System.out.print(1 + " ");
				} else {
					b[j] = a[j - 1] + a[j];
					System.out.print(b[j] + " ");

				}
			}

			System.out.println();
			for (k = 1; k <= i - 2; k++) {
				a[k] = b[k];
			}
		}

	}

}
