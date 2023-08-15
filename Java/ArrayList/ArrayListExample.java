package ArrayList;

import java.util.*;

public class ArrayListExample {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList al = new ArrayList();				// ArrayList<datatype> al = new ArrayList<datatype>();
		ArrayList a_list = new ArrayList();	
		al.add(10);									// ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
		al.add(20);									// ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
		al.add(30);
		al.add(40);
		System.out.println(al);						// toString() is being used in the backend
		
		boolean output = al.contains(20);
		System.out.println(output);
		
		al.set(0, 11);
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		System.out.println("Size: "+al.size());
		
		// Get an item at any index
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		a_list.addAll(al);												// addAll(int index, Collection c)
		System.out.println("a_list elements: "+a_list);					// used for appending elements from one list to another
	
	sc.close();
	}
}
