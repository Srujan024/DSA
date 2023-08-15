// Reversing the array through swapping using two pointer method

package Arrays;
import java.util.*;
public class ReverseArray {
	static int [] a = {1,4,2,5,6,7};

	public static void main(String[]args) {
		System.out.println(Arrays.toString(a));
		reverse(a);
		System.out.println(Arrays.toString(a));
		
		// Reversing with 'for' loop
		for(int i=a.length-1; i>=0 ; i--) {
			System.out.println(Arrays.toString(a));
		}
	}

	 static void reverse(int[] a) {
		 int start = 0;
		 int end = a.length-1;
		 while(start<end) {
			 swap(a,start,end);
			 start++;
			 end--;
		 }
	 }

	 static void swap(int[] a, int start, int end) {
		int temp = a[start];
		a[start] = a[end];
		a[end] = temp;
	}
}
