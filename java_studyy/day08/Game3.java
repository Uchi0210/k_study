package day08;

import java.io.*;

public class Game3 {

	public static void main(String[] args)
	throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int menu=0;
		
		System.out.println("=======================");
		System.out.println("가위 바위 보 게임  v1.0");
		System.out.println("-----------------------");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		System.out.println("========================");
		
		do {
			System.out.print("메뉴>");
			menu = Integer.parseInt(br.readLine());
			
			if(menu == 4) {
				System.out.println("게임을 종료합니다.");
				break; //System.exit(4);
			}
			//String[] ang = {"가위" , "바위" ,"보"};
			/*	if(menu<1 || menu>3) {
			}
				System.out.println("잘못된 수를 입력하셨습니다.");*/
			 int com  = (int)(Math.random()*3)+1;
			 
			 
			 if(menu==com) {
				 System.out.println("사용자:"+ menu);
				 System.out.println("컴퓨터:"+ com);
				 System.out.println("비겼습니다.");
			}else if((menu ==1 && com ==3 || 
					  menu==2 && com==1 || 
					  menu==3 && com==2)){
				 System.out.println("사용자:"+ menu);
				 System.out.println("컴퓨터:"+ com);
		         System.out.println("사용자승");
		    }else if((menu==3 && com==1 ||
		    		 menu==2 && com==3 ||
		    		 menu==1 && com==2)) {
		    	 System.out.println("사용자:"+ menu);
				 System.out.println("컴퓨터:"+ com);
			     System.out.println("컴퓨터승");
		}
	  }while(menu!=4);
		
		
		

	}

}

