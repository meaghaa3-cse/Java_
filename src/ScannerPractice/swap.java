package ScannerPractice;
import java.util.Scanner;

public class swap {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

}
