package sjd;

import java.util.*;

public class Fibonacci {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of terms");
		int n = sc.nextInt();
		int a=0,b=1;
		System.out.print(a);
		System.out.print(b);
		for(int i=1;i<=n-2;i++)
		{
		 	int sum = a + b;
			System.out.print(sum);
			a = b;
			b = sum;
		}
		sc.close();
	}
}
