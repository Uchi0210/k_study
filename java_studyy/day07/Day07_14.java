package day07;

import java.io.*;

public class Day07_14 {

	public static void main(String[] args)
		throws IOException{
		BufferedReader br =
				 new BufferedReader(new InputStreamReader(System.in));
		int i = 45;
		int input;
		do {
			System.out.print("숫자 입력:");
			input = Integer.parseInt(br.readLine());
		if(input<i) {
			System.out.println("업입니다");
		}else if(input>i){
			System.out.println("다운입니다.");

		}
		
	
			
		}while(input!=45);
		
		if(input==45)
		{
		System.out.println("정답입니다.");
		}
	}

}
