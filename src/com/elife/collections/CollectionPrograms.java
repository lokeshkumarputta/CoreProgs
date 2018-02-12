package com.elife.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionPrograms {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(4, "Mango");
		map.put(3, "Apple");
		map.put(5, "Orange");
		map.put(8, "Fruits");
		map.put(23, "Vegetables");
		map.put(1, "Zebra");
		map.put(5, "Yellow");

		// Normal HashMap Iteration
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Keys " + entry.getKey() + "\t" + " values " + entry.getValue());
		}
		System.out.println("******************************");

		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		for (Map.Entry entry : map.entrySet()) {
			treeMap.put((String) entry.getValue(), (Integer) entry.getKey());

		}
		System.out.println(treeMap);

		System.out.println("******************************");
		// Sorting on Values By using Java 8
		map.entrySet().stream().sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
				.forEach(k -> System.out.println(k.getKey() + " : " + k.getValue()));

		System.out.println("******************************");

	}

}
