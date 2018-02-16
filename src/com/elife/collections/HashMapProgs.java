package com.elife.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapProgs {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(111, "lllllll");
		hashMap.put(454, "kkkkkkk");
		hashMap.put(222, "yyyyyyy");
		hashMap.put(999, "aaaaaaa");
		
		// Iterating By using Normal for loop
		for(Map.Entry<Integer, String> entries : hashMap.entrySet()) {
			System.out.println("keys ::" +entries.getKey() + " =>" + " values :" +entries.getValue());
		}
		
		// Iteration by Using Java8 Stream Feature
		hashMap.entrySet().stream()
		.forEach(output -> System.out.println("keys ::" + output.getKey() + "values ::" +output.getValue()));
		
		// Sorting the HashMap values by Using TreeMap
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		for(Map.Entry entry : hashMap.entrySet()) {
			treeMap.put((String)entry.getValue(), (Integer)entry.getKey() );
		}
		System.out.println(treeMap);
		
	}

}
