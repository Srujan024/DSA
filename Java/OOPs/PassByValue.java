package sjd;

import java.util.Arrays;

//public class PassByValue {
//	public static void main(String[]args) {
//		int [] a = {1,3,5,28,12,4,56};
//		System.out.println(Arrays.toString(a));
//		changearray(a);
//		System.out.println(Arrays.toString(a));
//	}
//	static void changearray(int[]arr) {
//		arr[0] = 99;
//	}
//}

public class PassByValue {
	public static void main(String[]args) {
		int a = 10,b = 20;
		func(a,b);
		System.out.println(a+" & "+b);
	}
	static void func(int a,int b) {
		a = 5;
		b = 15;								// Values inside 'func' are localized,thus will not alter a & b values in the main function
		//System.out.println(a+" & "+b);	// Changes made here will remain in the function 'scope' itself
	}
}