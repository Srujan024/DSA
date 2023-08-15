package Searching;

import java.util.*;

public class SearchCharacter {
	public static void main(String[]args) {
		String s = "AbuIjwSKl";
		char target = 'j';
		System.out.println(search(s,target));
		System.out.println(Arrays.toString(s.toCharArray()));
	}

	static boolean search(String s, char target) {
		if(s.length()==0) {
			return false;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == target) {
				return true;
			}
		}
		return false;
	}
}
