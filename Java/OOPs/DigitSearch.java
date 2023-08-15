package sjd;

import java.util.*;

public class DigitSearch {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int sn = sc.nextInt();
		int count = 0;
		while(n>0)
		{
			int rem = n % 10;
			if(sn == rem)
			{
				count++;
			}
			n = n/10;
		}
		System.out.println(count);
	}
}
