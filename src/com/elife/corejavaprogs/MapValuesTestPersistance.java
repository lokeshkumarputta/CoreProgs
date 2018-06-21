package com.elife.corejavaprogs;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

public class MapValuesTestPersistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<>();
		m.put("1", "A");
		m.put("2", "B");
		m.put("3", "C");
		System.out.println(m.values()); // This will work but below will get compilation errors

		//		List<String>  l= m.values();	// Compilation error becoz we cannot keep type of values
		
	/*	for(String s : l){
			System.out.println(s);
		}*/
		
		
	}

}
