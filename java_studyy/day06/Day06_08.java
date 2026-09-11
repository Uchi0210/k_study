package day06;

public class Day06_08 {

	public static void main(String[] args) {
	 int sum = 1;
	 System.out.print(sum);
	 
	 for(int i=2;i<=10;i++) {
	   if(i % 2 !=0) {
		   System.out.print("+"+i);
		   sum = sum+i;
	   }else if(i % 2 ==0){
		   sum = sum-i;
		   System.out.print("-"+i); 
	}
	   
	   
		   
	   }
	      
	  System.out.print("="+sum);
	}
}
