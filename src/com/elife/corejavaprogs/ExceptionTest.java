/**
 * 
 */
package com.elife.corejavaprogs;

import java.io.IOException;

/**
 * @author Lokesh
 *
 */
public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ExceptionTest t = new ExceptionTest();
		int i = t.method1();
		System.out.println(i);
		
	}

	
int method1() {
	try{
		System.out.println("try ");
//		throw new IOException();
		return 1;
		
	}catch (Exception e) {
		System.out.println("E:::"+e);
//		throw new IOException();
		return 2;
	}finally {
//		System.exit(0);
		System.out.println("F");
//		return 3;
	}
	}


}
