package day10;

public class Day10_02 {

	public static void main(String[] args) {
		
		
		//1.선언
		int arr[][];
		
		//2.생성
		arr=new int[3][2];//3층 2호실
		
		//3.초기화
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		
		System.out.println("arr[0][0]="+arr[0][0]);
		System.out.println("arr[1][0]="+arr[1][0]);
		System.out.println("arr[2][0]="+arr[2][0]);
		
		for(int i=0;i<arr.length;i++) {//층을담당함 for
			for(int j=0;j<arr[i].length;j++) {//호실을 담당함 for
				System.out.print(arr[i][j]+" ");			
			}
			System.out.println();
		}
		

	}

}
