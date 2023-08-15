package sjd;

import java.util.*;

public class ArmstrongNo {
	static long res = 0,n_o,n_c;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		n_o = sc.nextInt();
		int len = (int)(Math.log10(n_o)+1);
		n_c = n_o;
		while(n_o>0) {
			long value = n_o % 10;
			res = (long) (res + Math.pow(value, len));
			n_o = n_o/10;
		}
		if(n_c == res) {
			System.out.print("True");
		}
		else {
			System.out.print("False");
		}
		sc.close();
}
}
