package basic;


import java.io.BufferedReader;
import java.io.InputStreamReader;



public class ResolveExprsn {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();
		char c[] = new char[exp.length()];
		for(int i=0;i<exp.length();i++){
			c[i]=exp.charAt(i);
			}
			
		for(int i=0;i<c.length;i++) {
			if(c[i] == '(' && c[i+1] == ')')
				{
				for(int j=i+2;j<c.length;j++)
					c[j-2]=c[j];
				}
			else if(c[i]== '(' && c[i+2]==')') {
				c[i]=c[i+1];
				c[i+1]=c[i+3];
				for(int j=i+4;j<c.length;j++){
					c[j-2]=c[j];
				}
				
				}
			else if(c[i] == '(' && c[i+2]==')') {}
				
				
		}
	
		
		
	}

}
