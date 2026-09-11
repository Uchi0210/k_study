package day08;

import java.io.*;

public class Game2 {

	public static void main(String[] args)
	throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int menu=0;
		int com =0;
		
		System.out.println("=======================");
		System.out.println("가위 바위 보 게임  v1.0");
		System.out.println("-----------------------");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		System.out.println("========================");
		
		for(;menu!=4;) {
			System.out.print("메뉴>");
			menu = Integer.parseInt(br.readLine());
		if(menu==4) {
			System.out.println("게임을 종료합니다.");
			System.exit(4);
		}
		com =(int)(Math.random()*3)+1;
		
		System.out.println("사용자"+menu);
		System.out.println("컴퓨터"+com);
		
		if(menu==com) {
			System.out.println("비겼습니다.");
		}else if((menu==1 && com==3 ||
				menu==2 && com==1||
				menu==3 && com==2)){
					System.out.println("이겼습니다.");
				}else {
					System.out.println("졌습니다.");
				}
				}

		
			
			
			
		}
		

	}

