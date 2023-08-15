package sjd;

import java.util.Arrays;

// function overloading

public class VariableLengthArguments {
	public static void main(String[]args) {
		func();
		func(0,1,2,3,4,5,6,7,8,9,10);
		func1('a','b','c','d','e');
		func2("SJD","SIzz","Musk","Bill","Aman");
	}
	static void func(int ...a) {					// Arguments length is not fixed
		System.out.println(Arrays.toString(a));
	}
	static void func1(char ...a) {					
		System.out.println(Arrays.toString(a));
	}
	static void func2(String ...a) {					
		System.out.print(Arrays.toString(a));
	}
}
