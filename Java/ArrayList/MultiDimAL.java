package ArrayList;

import java.util.*;

public class MultiDimAL {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> mal = new ArrayList<>();
		
		// initialize
		for(int i=0;i<3;i++) {						// creating empty list is necessary to access pos for element insertion
			mal.add(new ArrayList<>());				// [[],[],[]] is created
		}
		
		// take the input
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				mal.get(i).add(sc.nextInt());	
			}
		}
		
		// print the list
		System.out.println(mal);
		
	sc.close();
	}
}
