package com.elife.multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastIterator {

	/**
	 * It Throws ConncurrentModificationException.
	 * Internal work : 	Iterator reads the Internal dataStructure.
	 * 					Internal ds maintains a flag called mods
	 * 					if structural changes happens then mods value will change
	 * 					Then iterator throws the ConcurrentModification Exception
	 */
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		map.put("APPLE", "IPHONE");
		map.put("Android", "MOTO");
		map.put("Windows", "Nokia");
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
			map.put("NewOS", "NewPhone");
		}
	}

}
