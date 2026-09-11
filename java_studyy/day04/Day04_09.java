package day04;

import java.io.*;

public class Day04_09 {

	public static void main(String[] args)
	throws IOException {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.print("반지름 입력:");
		String radius_s=br.readLine();
		double radius= Double.parseDouble(radius_s);
		
		double good = radius*radius*3.14;
		
		System.out.println("원의넓이:"+(good));
		
		
		
		
		

	}

}
