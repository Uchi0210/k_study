package day05;

import java.io.*;

public class Day05_06 {

	public static void main(String[] args)
	throws IOException{
		
		System.out.print("문자를 입력:");
		int user = System.in.read();
	
		
		
        
		
		if(user == 70 || user ==102) {
			System.out.println("Father");
		}else if(user==77||user==109){
			System.out.println("Mother");
		}else if(user==66||user==98) {
			System.out.println("Brother");
		}else if(user==83||user==115) {
			System.out.println("Sister");
		}else {
			System.out.println("입력값이 옳지않습니다.");
		}

	}

}
