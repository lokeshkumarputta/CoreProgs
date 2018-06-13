package com.elife.corejavaprogs;

public class StringSplit {

	public static void main(String[] args) {
		
		
		String profileName = "applicationName_customerName"; 
		
		String[] finalName = profileName.split("_");
		
		String appName = finalName[0];
		String custName = finalName[1];
		
		System.out.println(appName);
		System.out.println(custName);
		
		
		
	}
}
