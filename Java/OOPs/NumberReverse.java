package sjd;

import java.util.*;

public class NumberReverse {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
//		while(n>0)
//		{
//			int rem = n % 10;
//			System.out.print(rem);
//			n = n/10;
//		}
		int i=0;
		while(n>0)
		{
			int rem = n % 10;
			i = i * 10 + rem;
			n = n/10;
		}
		System.out.print(i);
	}
}
