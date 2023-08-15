package Arrays;

import java.util.*;

public class TwoDimArray {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
//		 int [][] a = new int[3][];					// Specifying no of rows in compulsary
//		 int b[][] = {{1,2,3},{4,5},{6,7,8,9}}; 
		
//		int [][]arr = {{1,2},{3,4}};
//		int length = arr.length;
//		System.out.println("Array Length: "+ length); // Gives the no of rows
		
		// Reading array elements
		int c_array[][] = new int[3][3];
		System.out.println("Enter array elements");
		for(int row=0 ; row<c_array.length ; row++ )
		{	
			for(int col=0 ; col<c_array[row].length ; col++)
			{	
				c_array[row][col] = sc.nextInt();
			}
		}	
		
		System.out.println("Array Elements are: ");
		for(int row=0 ; row<c_array.length ; row++ )
		{	
			for(int col=0 ; col<c_array[row].length ; col++)
			{
				System.out.print(c_array[row][col]+" ");
			}
			System.out.println();
		}
		
		// Simpler way of printing
		System.out.println("Using simpler for loop");
		for(int row=0 ; row<c_array.length ; row++)
			System.out.println(Arrays.toString(c_array[row]));
		
		// Enhanced for loop
		System.out.println("Using enhanced for loop");
		for(int[] a:c_array)									// for(datatype [] variable:array_name)
			System.out.println(Arrays.toString(a));
	sc.close();
	}
}
