package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class GenericArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> intarr = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		
		
		arrayListIteration(intarr);
		
		getNonDuplicateElement(intarr);
		
		sortAndCompareArray();
	}
	
	static void arrayListIteration(ArrayList<Integer> intarr) {
		
		for(int i=0;i<intarr.size();i++) {
			
			System.out.println(intarr.get(i));
			
		}
		
		System.out.println("---------------------------------------------");
		
		//For each
		for(int i : intarr) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------------------------");
		
		//Iterator
		Iterator<Integer> itr = intarr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	static void getNonDuplicateElement(ArrayList<Integer> intarr) {

		LinkedHashSet<Integer> intArr = new LinkedHashSet<Integer>(intarr);
		
		ArrayList<Integer> intArr2 = new ArrayList<Integer>(intArr);
		
		for(int i : intArr2) {
			System.out.println(i);
		}
	}
	
	static void sortAndCompareArray() {
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","G"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","G"));
		
		// Sorting
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		
		//Compare and check if are equal
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		//remove one list element form another list
		l1.removeAll(l2);
		
		System.out.println(l1);
		
		//findout common
		l2.retainAll(l3);
		
		System.out.println(l2);
		
		
		
	}
}
