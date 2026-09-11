package day05;

import java.io.*;

public class Day05_08 {

	public static void main(String[] args)
	throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력:");
		String year_s=br.readLine();
		int year = Integer.parseInt(year_s);
		
		if((year % 4 ==0 && year % 100 !=0)|| (year % 400 ==0)){
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
	}

}
