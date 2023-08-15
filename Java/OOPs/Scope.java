package sjd;

public class Scope {
	public static void main(String[]args) {
		int a = 10,b = 20;
		func(a,b);
		System.out.println(a+" & "+b);
		
		// *Block Scope*
		{
//			int a = 1;     // This will give an error as same reference variable is being used to store diff. values
			a = 8;
			System.out.println(a);
			int c = 0;
		}
//		System.out.println(c);		// Initialized Block variables can't be accessed from outside;
 	
		// *Scoping in for loop*
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
		}
	}
	
	// *Function scope*
	static void func(int a,int b) {
		a = 5;
		b = 15;								
	}
}
