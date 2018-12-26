package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Area {
	Double r;
	Area(Double d) {
		r = d;
		}
	Double calc() {
		return (22/7)*r*r;
	}
}

public class CircleArea {

	
	public static void main(String[] args) throws Exception {
		System.out.println("Enter Circle radius in cm");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		//String s = br;
		Double r = Double.parseDouble(br.readLine());
		Area a  = new Area(r);
		System.out.println("Area : "+a.calc());
		
		
		
	}

	
	

}
