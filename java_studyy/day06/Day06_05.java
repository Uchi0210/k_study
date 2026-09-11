package day06;

public class Day06_05 {

	public static void main(String[] args) {
//		int sum=0;
//		for(int count = 0; count <= 50; count=count+5) {     
//		System.out.println(count);
//			sum=sum+count;
//		}
//          System.out.println("배수의 합:"+sum);
	
	int sum=0;
	for(int i=0;i <=50; i++) {
		if(i%5==0) {
			System.out.println(i);
			sum+=i;
		}
	}
	System.out.println("5의배수의 합:"+sum);
	}

}