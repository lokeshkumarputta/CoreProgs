package com.elife.multithreading;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {

	/**
	 * Runs Successfully without throwing any exception, because
	 * Internal Works : FailSafe iterator maintains a copy of original data structure.
	 * 					So iterating will happens on copy of the data structure.
	 * 					Original DS will remains same so it wont throw any exception 
	 */					
	public static void main(String[] args) {
		ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
		map.put("APPLE", "IPHONE");
		map.put("Android", "MOTO");
		map.put("Windows", "Nokia");
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
			map.put("NEWOS", "NEWPHONE");
		}
	}
}
