package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;


public class hashMapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//no order no indexing
		//Stores value in --key and value pair-- format
		//Key can not be duplicate -- will replace the old value with new one if key is duplicated
		//can store N number of null values, but only 1 null key
		
		createBasicHashMap();
		System.out.println("-----------------------------------------");
		hashMapComparision();
		
	}
	
	
	// Basic Hash map creation and iterating
	
	static void createBasicHashMap() {
		
		HashMap<String, String> capitalList = new HashMap<String, String>();
		capitalList.put("India", "Delhi");
		capitalList.put("USA", "WDC");
		capitalList.put("UK", "London");
		
		Iterator<String> itr = capitalList.keySet().iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			String value = capitalList.get(key);
			System.out.println("Key : "+key+" || Value : "+value);
		}
		
		System.out.println("-----------------------------------------");
		
		Iterator<Entry<String, String>> itr2 = capitalList.entrySet().iterator(); 
		
		while(itr2.hasNext()) {
			Entry<String,String> entry = itr2.next();
			System.out.println("Key : "+entry.getKey()+" || Value : "+entry.getValue());
		}
	}
	
	static void hashMapComparision() {
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(3, "C");
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "D");
		
		// On the basis of key-value : use equals method
		System.out.println(map1.equals(map2)); // Same number of pairs -- true
		System.out.println(map1.equals(map3)); // Different Number of pairs -- false
		
		//Compare Key Set
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		
		// Find out extra key
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(3, "C");
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(4, "D");
		
		HashSet<Integer> combinedKey = new HashSet<Integer>(map1.keySet());
		combinedKey.addAll(map4.keySet());
		combinedKey.removeAll(map1.keySet());
		System.out.println(combinedKey);
		
		// Compare by value
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(3, "C");
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(4, "C");
		//1. duplicates are not allowed : using list ---- As being a list doesn't ignores the repeated entry hence
		// the length becomes +1 of m5 than m1 hence false 
		System.out.println(new ArrayList<String>(map1.values()).equals(new ArrayList<String>(map2.values())));
		System.out.println(new ArrayList<String>(map1.values()).equals(new ArrayList<String>(map5.values())));
		
		//2.duplicate are allowed : using Hash set ---- as being set it does not takes repeated entry hence
		//all pass
		System.out.println(new HashSet<String>(map1.values()).equals(new HashSet<String>(map2.values())));
		System.out.println(new HashSet<String>(map1.values()).equals(new HashSet<String>(map5.values())));
	}
}
