package day04;

import java.io.*;
import java.text.DecimalFormat;

public class Day04_08 {

	public static void main(String[] args)
	throws IOException{
		
		
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어:");
		String num1_s= br.readLine();
		int num1 = Integer.parseInt(num1_s);
		
		System.out.print("영어:");
		String num2_s= br.readLine();
		int num2 = Integer.parseInt(num2_s);
		
		System.out.print("수학:");
		String num3_s = br.readLine();
		int num3 = Integer.parseInt(num3_s);
		
		int sum = (num1+num2+num3);
		
		System.out.println("총점:"+(sum)+"점");
		System.out.println("평균:"+(sum/3)+"점");
		
		double avg =sum/3.0;
		System.out.println("평균:"+avg+"점");
		System.out.printf("평균:%.2f점\n",avg);
		
		DecimalFormat df= new DecimalFormat();
		df.applyLocalizedPattern("#.00");
		System.out.println("평균:"+df.format(avg)+"점");
		
		
		

	}

}
