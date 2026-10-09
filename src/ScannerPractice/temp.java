package ScannerPractice;

import java.util.Scanner;

public class temp {
	public static void main(String x[])
	{
		System.out.println("enter the celcius value:");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		float f = ((9/5)*c + 32);
		System.out.println("frenheit = :"+f);
		
		
	}

}
