package day05;

import java.io.*;

public class Day05_07 {

	public static void main(String[] args)
	throws IOException{
		
		System.out.print("문자입력:");
		
		
		int num = System.in.read();
		
		if(num>=48&& num<=57) {
			System.out.println("입력한"+(char)num+"은 숫자입니다.");
		}else if((num>='a'&&num<='z')||(num>='A'&&num<='Z')){
			System.out.println("입력한"+(char)num+"은 영어입니다.");
		}else {
			System.out.println("입력한"+(char)num+"은 기타문자입니다.");
		}

	}

}
