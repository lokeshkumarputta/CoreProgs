package com.elife.collections;

import java.util.TreeSet;

public class TreeSetProgs {

	public static void main(String[] args) {
		/**
		 * Maintains Order and Sorting
		 * Wont allow the Null Values
		 * Wont allow the Duplicate Values
		 */
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("jjjjjjjj");
		treeSet.add("oooooooo");
		treeSet.add("gggggggg");
		
//		treeSet.add(null);
		treeSet.add("gggggggg");
		System.out.println("Normal TreeSet Output" + treeSet);
		
		
		for(String str : treeSet) {
			System.out.println("Iteration over the TreeSet :: " +str);
		}
		
		
	}

}
