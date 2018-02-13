package com.elife.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorProgs {

	public static void main(String[] args) {
		/**
		 * Vector is Synchronized So it will use only on MultiTasking programs
		 * Vector allow null values and duplicate values
		 */
		
		Vector<String> vec = new Vector<>();
		vec.add("aaadddfd");
		vec.add("hhhhhhhh");
		vec.add("jjjjjj");
		vec.add("zzzzzzz");
		vec.add(null);
		vec.add("");
		
		vec.add("hhhhhhhh");
// Adding value @ particular index 
		vec.add(3, "qqqqqqqqq");
		System.out.println("Normal vector elements are :: " +vec);
		
// Removing value @ Particular index
		vec.removeElementAt(3);

// Iterating by using enumerators
		System.out.println("after iteration of vector elements are ::");
 
		Enumeration<String> en = vec.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}
