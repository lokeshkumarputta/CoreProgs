package com.elife.corejavaprogs;

public class StringIteration {

	public static void main(String[] args) {
		
		String str1="abcadbcg";
		String str2="bc";
		int count = 0;
		
		for(int i =0 ; i < str1.length() ; i++) {
			
			if(str1.charAt(i) == str2.charAt(0)) {
				
				for (int j = i+1; j < str1.length(); j++) {
					
					if(str1.charAt(j) == str2.charAt(1))
					{
						count++;
						break;
					}
					
				}
			}
		}
		
		System.out.println("count : " +count);

	}

}
