package com.elife.corejavaprogs;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Please enter the input String ::");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int count = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if(c[i] == c[j]){
					System.out.println("The repeatable char is :" +c[j]);
					count++;
					break;
					
				}
			}
		}

	}

}
