package com.elife.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DumbSort {
	public static void main(String[] args) {
		
		int[] input = {5,6,6,4,3};
		
		System.out.print("Before Sort ::");
		for (int i : input) {
			System.out.print(i);
		}
		
		
		dumbSort(input);
		System.out.print("\n" + "After Sort ::");
		for (int i : input) {
			System.out.print(i);
			
		}
		
		int result = testCases(input);
		for(int i=0; i<input.length; i++) {
		if(result == -1) {
			System.out.println( "\n" + "Case #" + (i+1) + ":" + " OK");
		}
		else {
			System.out.println("Case #" + (i+1) + ": " + result);

		}
		}
		
		
	}

	public static void dumbSort(int a[]) { 
		boolean done = false;
		while (!done) {
			done = true;

			for (int i = 0; i < (a.length - 2); i++) {
				if (a[i] > a[i + 2]) {
					done = false;
					int temp = a[i];
					a[i] = a[i + 2];
					a[i + 2] = temp;
				}
			}
		}
	} 

	
	public static int testCases(int a[]) {
		int index = -1;
		for(int i=0; i<a.length-1; i++) {
			if(a[i] > a[i+1]) {
				index = i;
				return index;
			}
		}
		return index;
	}
}