package com.elife.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TreeMapProgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * When ever we required Sorted Format of values then we can go for Map to TreeMap
		 */
		Map<Integer, String> treeMap = new TreeMap<>();

		treeMap.put(123, "FFFFF");
		treeMap.put(321, "JJJJJJ");
		treeMap.put(56, "OOOOOO");
		treeMap.put(46, "LLLLLL");
		treeMap.put(99, "ZZZZZZ");
		System.out.println("Normal TreeMap output:: " + treeMap);
		
		// Traversing by using for loop and iterator
		
		// SORTING By using Keys
		for (Map.Entry entry : treeMap.entrySet()) {
			System.out.println("keys ::" + entry.getKey() + "=>" + "values :: " + entry.getValue());
		}

		// Sorting By Using Iterator
		System.out.println("*********************************************");
		Iterator it = treeMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("Keys are " +entry.getKey() + "values are " +entry.getValue());
		}
		System.out.println("**********************************************");

		// Sorting By Using Values and using Java 8 Features
		treeMap.entrySet().stream().sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
			.forEach(k -> System.out.println(k.getKey() + ":" + k.getValue()));

		
	}

}
