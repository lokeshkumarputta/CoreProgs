package com.elife.corejavaprogs;
import java.util.Scanner;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {

		String string = "i am lokesh kumar w r i t i n g a removing s p a c e prog ram";
		
		String output  = null;
		
		
		/*for(int i = 0; i<=s.length(); i++) {
			
			output = s.replaceAll("\\s", "");
		
		}
		System.out.println(output);*/
		
		/*StringBuffer sb = new StringBuffer();
		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if((ch[i] != ' ')){
				sb.append(ch[i]);
				}
		}
		System.out.println(sb);*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string with saspace :: ");
		
		String input = scan.nextLine();
		
		output = input.replace(" ","");
		
		System.out.println(output);
		
		
	
	}

}
