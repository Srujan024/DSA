// Binary Search requires a sorted array

package Searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {1,12,34,46,52,69,70,88,93,109};
		System.out.print("Enter search element: ");
		int key = sc.nextInt();
		int index = Search(a,key,0,a.length-1);
		if(index == -1) {
			System.out.print("Element not found");
		}
		else {
			System.out.print("Element found at index "+index);
		}	
		sc.close();
	}

	// Recursion
	static int Search(int[] a, int key,int low,int high) {
		int mid = low+(high-low)/2;
		if(key == a[mid]) {
			return mid;
		}
		else if(key < a[mid]) {
			return Search(a,key,0,mid-1);
		}
		else {
			return Search(a,key,mid+1,a.length-1);
		}
	}
	
	// Iteration
//	static int Search(int[] a, int key,int low,int high) {
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            if (a[mid] == key) {
//                return mid;
//            }
//            if (a[mid] < key) {
//                low = mid + 1;
//            }
//            else {
//                high = mid - 1;
//            }
//        }
//        return -1;
//    }
}