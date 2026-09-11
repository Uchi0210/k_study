package day06;

import java.io.*;

public class Day06_03 {

	public static void main(String[] args)
    throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어:");
		String kor_s=br.readLine();
		int kor = Integer.parseInt(kor_s);
		
		System.out.print("영어:");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학:");
		int mat = Integer.parseInt(br.readLine());
		
		int total = kor+eng+mat;
		double a = total/3.0;
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+a);
		
		char b = 'F';
		
		switch((int)a/10) {
		case 10:
		case 9: b = 'A';break;
		case 8: b = 'B';break;
		case 7: b = 'C';break;
		case 6: b = 'D';break;
		default: b = 'F';
		}
		
		System.out.println("등급:"+b);
		}
		
		

	}


