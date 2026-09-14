package day09;

import java.io.*;

public class Day09_07 {

	public static void main(String[] args)
	throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("몇명의 학생점수입력:");
		int count = Integer.parseInt(br.readLine());
		
		int score[]=new int[count];
		int sum = 0;
	
		for(int i=0; i<score.length;i++) {
		System.out.print(i+1+"번 학생:");
		score[i]=Integer.parseInt(br.readLine());
        sum += score[i];
	}
		double avg = (double)(sum /score.length);
		System.out.println("총점:"+sum);
		System.out.println("평균:"+avg);
 }
}