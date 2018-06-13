package com.elife.collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Conversions {

	public static void main(String[] args) {

// List to Map
		List<Products> productList = new ArrayList<>();
		
		productList.add(new Products(101, "lokesh"));
		productList.add(new Products(102, "kumar"));
		
		Map<Integer, String> map = new HashMap<>();
		for (Products products : productList) {
			System.out.println("Results comes after iteration :" + products);
			map.put(products.getPid(), products.getPname());
			System.out.println("Results in Map :" + map);
		}
		
		// By using Stream and Lamda expressions in Java 8
		
		Map finalResult = new HashMap<>();
		finalResult = productList.stream().collect(Collectors.toMap(Products :: getPid, Products :: getPname));
		
		System.out.println("finalResult by using streams:" + finalResult);

// Map to List 
		
		Map<Integer, String> mapObject = new HashMap<>();
		
		mapObject.put(1000, "Lakshmi");
		mapObject.put(1001, "kadiri");
		
		List<String> lists = new ArrayList<>(mapObject.values());
		List<Integer> intList = new ArrayList<>(mapObject.keySet());
		System.out.println("lits of keys " +intList);
		System.out.println("lits of values " +lists);
		
		// By using Stream and Lamda expressions in Java 8
		
		List<String> mapToListOutput = mapObject.values().stream().collect(Collectors.toList());
		
		List<Integer> mapToListResult = mapObject.keySet().stream().collect(Collectors.toList());
		
		System.out.println("FinalOutput of values by using streams " +mapToListOutput);
		
		System.out.println("Result of KeySets" +mapToListResult);

// Set to List 
		
		Set<String> setObject = new TreeSet<>();
		setObject.add("A");
		setObject.add("C");
		setObject.add("B");
        
        List<String> setToListOutput = setObject.stream().collect(Collectors.toList());
        
        System.out.println("Final output of Set to List values by using streams ::" + setToListOutput);
        
       
 // List to Set
        List<String> listObject = new ArrayList<>();
        
        listObject.add("X");
        listObject.add("Z");
        listObject.add("Y");
        
        Set<String> listToSetOutput = listObject.stream().collect(Collectors.toSet());
        
        System.out.println("Final output of List to Set values by using streams ::" + listToSetOutput);
        
        
        
	}
	

}
