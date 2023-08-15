// Linear Search is applicable for unsorted array

package Searching;

import java.util.*;

public class LinearSearch {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {2,4,1,5,13,23,56,14,106,68,210};
		System.out.print("Enter search element: ");
		int key = sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i] == key) {
				System.out.println("Element found at index "+i);
				break;
			}
		}
		sc.close();
	}
}
