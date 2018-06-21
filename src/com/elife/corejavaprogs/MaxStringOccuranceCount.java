package com.elife.corejavaprogs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaxStringOccuranceCount {

	public static void main(String[] args) {
		String[] array = {"name1","name2","name3","name4", "name5", "name2","name2","name2"};
		Arrays.stream(array)
		      .collect(Collectors.groupingBy(s -> s))
		      .forEach((k, v) -> System.out.println(k+" "+v.size()));
		
	}
	
	
}
