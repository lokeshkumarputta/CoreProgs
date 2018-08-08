package com.elife.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.elife.collections.Products;

public class Streams {

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

		// By using Streams and Lamda expressions in Java 8

		Map finalResult = new HashMap<>();
		finalResult = productList.stream().collect(Collectors.toMap(Products::getPid, Products::getPname));
		System.out.println("finalResult by using streams:" + finalResult);

		// Map to List

		Map<Integer, String> mapObject = new HashMap<>();

		mapObject.put(1000, "Lakshmi");
		mapObject.put(1001, "kadiri");

		List<String> lists = new ArrayList<>(mapObject.values());
		List<Integer> intList = new ArrayList<>(mapObject.keySet());
		System.out.println("lits of keys " + intList);
		System.out.println("lits of values " + lists);

		// By using Stream and Lamda expressions in Java 8

		List<String> mapToListOutput = mapObject.values().stream().collect(Collectors.toList());

		System.out.println("FinalOutput of values by using streams " + mapToListOutput);

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
		
		// Streams usages 
		
		
		// Filter even numbers in the list
		
		List<String> givenNumber = Arrays.asList("1","2","3");
		System.out.println("Original List:" +givenNumber);
		
		List<Integer> evenNumbers = givenNumber.stream()						// for looping using stream
				.map(integerconvert ->Integer.valueOf(integerconvert))			// for converting String to integers using map
				.filter(number -> number % 2 == 0)								// for even number filtering using filter
				.collect(Collectors.toList());									// to return list of integers
		
		System.out.println("Even number list ::"  + evenNumbers);
		
		
		// Filter List of names by using lenght of Strings
		
		List<String> name = Arrays.asList("lokeshputta" , "sreelakshmi" , "putta" );
		
		List<String> result = (name.stream().filter(str -> str.length() > 6)
				.collect(Collectors.toList()));;
		
		result.forEach(System.out :: println);
		
	}
}
