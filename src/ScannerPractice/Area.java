package ScannerPractice;
import java.util.Scanner;

public class Area {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length and height");
		int l = sc.nextInt();
		int b = sc.nextInt();
		float area = l*b;
		System.out.println("area of rectangle:" + area);
	}

}
