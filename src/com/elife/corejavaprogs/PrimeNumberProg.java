package com.elife.corejavaprogs;

import java.util.Scanner;

public class PrimeNumberProg {

	public static void main(String args[]) {
		// Prime number : Number should multiply with itself and 1
		// Based on flag it will decide 
		// Need to use n %1 == 0 make it flag as 1 then its not a prime else its a prime upto loop i<=n/2

		System.out.println("Please enter input::");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		System.out.println("Input is  ::" + input);
		int n = Integer.parseInt(input);
		
		int i, m = 0, flag = 0;
		
		/*if(n==0 || n==1){
			System.out.println(n + " its not a prime number");
		}
		else{*/
			for(i = 2; i<=n/2 ; i++){
				if(n% i == 0){
					flag = 1 ;
					break;
				}
			}
			if(flag == 0){
				System.out.println(n + " is a prime number");
			}else{
				System.out.println(n + " not a priime number" );
			}
		}
//	}
}
