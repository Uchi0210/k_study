package day07;

import java.io.*;

public class Day07_13 {

	public static void main(String[] args)
	throws IOException{
		BufferedReader br =
				 new BufferedReader(new InputStreamReader(System.in));
		int password=1234;
		int input;
		do {
		System.out.print("비밀번호:");
		input = Integer.parseInt(br.readLine());
		} while (input != password);
		System.out.print("비밀번호:"+password);
		System.exit(password);
	}

}
