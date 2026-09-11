package day05;

import java.io.*;

public class Day05_01 {

	public static void main(String[] args)
	throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("반지름입력:");
		String user_s=br.readLine();
		double user =Double.parseDouble(user_s);
		double result = user*user*3.14;
		
		System.out.println("원의넓이:"+(result));
		
		
		

	}

}
