package com.elife.corejavaprogs;

import java.util.HashMap;
import java.util.Scanner;

public class CharOccurencesProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		aaabbbcccccddddaabbcc
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Input given String is :" +sc);
		
		if(sc == null) {
			System.out.println("There is no input given plz pass the input");
		}else {
			String result = null;
			result = repeatingChar(input);
		}
	}

	private static String repeatingChar(String input) {
		
		String result = null;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			
			char ch =  input.charAt(i);
			if(map.containsKey(ch)) {
//				map.get(i)
			}else {
				map.put(ch, 1);
			}
				
		}
		
		return result;

		
	}

}
