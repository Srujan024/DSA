// search and return pos of the element in a 2d-array

package Searching;
import java.util.*;
public class ReturnSearchPosAsArray {
	public static void main(String[]args) {
		int [][]a = {
				{2,31,13},
				{-3,67,18},
				{77,54,52}
		};
		int target = -3;
		int ans[] = search(a,target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] search(int [][]a,int target) {
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				if(a[row][col] == target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
}
