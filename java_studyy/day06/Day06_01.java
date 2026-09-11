package day06;

import java.io.*;

public class Day06_01 {

	public static void main(String[] args)
	throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어:");
		String kor_s=br.readLine();
		int kor = Integer.parseInt(kor_s);
		
		System.out.print("영어:");
		String eng_s=br.readLine();
		int eng = Integer.parseInt(eng_s);
		
		System.out.print("수학:");
		String math_s=br.readLine();
		int math = Integer.parseInt(math_s);
		
		int total = kor+eng+math;
		int a = total/3;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+a);
		
		char b='F';
		
		if(a >= 90) {
			b = 'A';
		}else if(a>=80) {
			b = 'B';
		}else if(a>=70) {
			b = 'C';
		}else if(a>=60) {
			b = 'D';
		}else {
			b = 'F';
		}
		System.out.println("등급:"+b);

	}

}
