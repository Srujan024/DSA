package Searching;

public class MinMaxElement {
	public static void main(String[]args) {
		int a[] = {12,45,-2,-14,34,56,4,61};
		SearchMinMax(a);
	}
	static void SearchMinMax(int a[]) {
		int min = a[0],max = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
			else{
				max = a[i];
			}
		}
		System.out.println("Min: "+min+" Max: "+max);
	}
}
