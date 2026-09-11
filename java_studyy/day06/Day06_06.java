package day06;

import java.io.*;

public class Day06_06 {

	public static void main(String[] args)
	throws IOException{
		
	 BufferedReader br =
	 new BufferedReader(new InputStreamReader(System.in));
      
	 System.out.print("단입력:");
	 int dan =Integer.parseInt (br.readLine());
	 
	 for(int i=1;i<=9;i++) {
		 System.out.println(dan+"*"+i+"="+(dan * i));
	 }
	}

}
