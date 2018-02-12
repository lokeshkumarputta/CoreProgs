/**
 * 
 */
package com.elife.corejavaprogs;

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
		System.out.println(1);
		
	}

	
int method1() {
	try{
		System.out.println("try ");
		return 1;
		
	}catch (Exception e) {
		System.out.println("E"+e);
		return 2;
	}finally {
		System.exit(0);
		System.out.println("F");
		return 3;
	}
	}


}
