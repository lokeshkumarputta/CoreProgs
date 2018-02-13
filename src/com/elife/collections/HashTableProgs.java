package com.elife.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableProgs {

	public static void main(String[] args) {

		/**
		 * Synchronized 
		 * Wont maintain insertion order
		 * Allows duplicate keys and values
		 * Wont allow null keys &  values
		 */
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("2", "loke");
		ht.put("9", "raje");
		ht.put("5", "sree");
		ht.put("2", "Hari");
//		ht.put("2", null);
//		ht.put(null, "hari");
		
		
		System.out.println("Normal Hashtable output ::" +ht);
		
// Iterating the Hashtable
		String key ,value = null;
		Enumeration<String> en = ht.keys();
		while(en.hasMoreElements()) {
			key = (String)en.nextElement();
			value = ht.get(key);
			System.out.println("Keys are  ::" + key);
			System.out.println("values are::" + value);
//			ht.get(key);
//			ht.get(value);
		}
	}

}
