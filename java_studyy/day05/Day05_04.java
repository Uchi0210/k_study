package day05;

import java.io.*;

public class Day05_04 {

	public static void main(String[] args)
	throws IOException{
		
		System.out.print("0~9사이의 수를 입력하시오:");
		int num1=System.in.read()-48;
		
		
		if(num1 % 2 == 0) {
			System.out.println(num1+"는 짝수입니다.");
		}else {
			System.out.println(num1+"는 홀수입니다.");
		}
		
		
		

	}

}
