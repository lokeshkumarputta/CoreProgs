package com.elife.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListProgs {

	public static void main(String[] args) {

		/**
		 * ArrayList is not Synchronzied so it faster than vector
		 * ArrayList grows Dynamically
		 * We can Synchronize the ArrayList
		 */
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("llllllllll");
		arrList.add("jjjjjjjjjj");
		arrList.add("aaaaaaaaaa");
		arrList.add("zzzzzzzzzz");
		
		System.out.println("Normal ARRAYlist Values are ::" + arrList);
		
// Iterate over the arraylist
		System.out.println("Normal Iteration values are :: " );
		for (Iterator iterator = arrList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
// Iterate By using Java8 forEach functionality
		System.out.println("Java8 ForEach and Consumer Iteration values :: ");
		arrList.forEach(new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		});
		
// By using Lamda expression -> we can avoid the consumer code
		System.out.println("advanced foreach by using lamda expression(->) :" );
		arrList.forEach(str -> System.out.println(str));
		
// Synchronize the ArrayList
		List list = Collections.synchronizedList(arrList);
		System.out.println("after synchronized ::" + arrList);
	}

}
