package com.elife.collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class CuncurrentHashMapProgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ConcurrentHashMap wont allow the null keys and values as like HashMap.
		ConcurrentHashMap<Integer, String> chm= new ConcurrentHashMap<>();
		chm.put(101, "Lokesh");
		chm.put(102, "Putta");
		chm.put(103, "Sree");
		chm.put(null, null);
		System.out.println(chm);
		
		
		HashMap<Integer, String> hm= new HashMap<>();
		hm.put(101, "Lokesh");
		hm.put(102, "Putta");
		hm.put(103, "Sree");
		hm.put(null, null);
		System.out.println(hm);
	}

}
