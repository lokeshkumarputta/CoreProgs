package com.elife.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListProgs {

	public static void main(String[] args) {

		/**
		 * LinkedList allows for insertions and removals using iterators
		 * 
		 * LinkedList can be searched forward and backward but it takes time
		 */
		
		LinkedList<String> lList = new LinkedList();
		lList.add("aaaa");
		lList.add("kkkkk");
		lList.add("ggggg");
		lList.add("zzzzz");
		System.out.println("Normal LinkedList values" +lList);
		/*Add First and Last Element*/
		
		lList.addFirst("bbbbbb");
		lList.addLast("yyyyy");
		
		
		System.out.println("after adding the LinkedList values" + lList);
		
		/*Remove first and last element*/
		
		lList.remove(0);
		lList.remove(4);
		
		System.out.println("After removing the linkedList values" + lList);
		/* Add to a Position and remove from a position*/
		
		lList.add(0, "jjjjjjj");
		lList.add(4, "hhhhhhhh");
		
		lList.remove(1);
		lList.remove(2);
		
		System.out.println("After Add to a Position and remove from a position values" + lList);

	}

}
