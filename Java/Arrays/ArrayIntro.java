package Arrays;

import java.util.*;

public class ArrayIntro {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Elements");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Printing using normal for loop");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		System.out.println("Printing using for each loop");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		System.out.println("\nPrinting Array as a List");
		System.out.print(Arrays.toString(arr));					// Uses 'for loop' in the backend to append brackets and commas 
		sc.close();
	}
}
