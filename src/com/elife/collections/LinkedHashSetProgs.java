package com.elife.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetProgs {

	public static void main(String[] args) {

		/**
		 * Maintain Same Insertion Order
		 */

		LinkedHashSet<String> lhSet = new LinkedHashSet<>();
		
		lhSet.add("ddddddddd");
		lhSet.add("ghhhhhhhh");
		lhSet.add("bbbbbbbbb");
		lhSet.add("bbbbbbbbb");
		lhSet.add(null);
		System.out.println("Normal LinkedHashSet values " + lhSet);
		
		
	}

}
