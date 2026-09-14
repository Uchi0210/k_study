package day09;

import java.io.*;

public class Day09_06 {

	public static void main(String[] args) 
	throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
      int num[]= {0,0,0,0,0,0};
      
      for(int i=0;i<num.length;i++) {
    	  System.out.print("6개의점수입력:");
    	  num[i] = Integer.parseInt(br.readLine());
    	  
      }
      for(int i =0;i<num.length;i++) {
    	  System.out.println(num[i]+ " ");
      }
	}
}


