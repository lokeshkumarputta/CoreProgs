package com.elife.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgs {

	public static void main(String[] args) {

		/**
		 * Hashset is not synchronized 
		 * won't maintain any order 
		 * doesn't allows duplicates
		 * allows null values
		 * 
		 */
		HashSet<String> hSet = new HashSet<>();
		hSet.add("one");
		hSet.add("two");
		hSet.add("five");
		
		hSet.add(null);
		hSet.add(null);
		hSet.add("");
		hSet.add("one");
		
		System.out.println("Normal HashSet values are :: " +hSet);
		
// Iterating the Hashset 
		
		Iterator<String> it = hSet.iterator();
		System.out.println("After iterating the HashSet values are ::");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
// Using normal ForEach
		
		for(String str : hSet) {
			System.out.println("Normal foreach iteration ::" + str);
		}
	}

}
