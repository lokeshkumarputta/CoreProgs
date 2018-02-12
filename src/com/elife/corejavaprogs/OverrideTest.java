/**
 * 
 */
package com.elife.corejavaprogs;

/**
 * @author Lokesh
 *
 */
public class OverrideTest {

	public OverrideTest() {
		System.out.println("OverrideTest");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new C1();
	}
	

}
class A1{
	A1(){
		
		System.out.println("A");
	}
}
class B1 extends A1{
	B1(){
//		super();	
	System.out.println("B");
	
	}
}
class C1 extends A1{
	C1(){
		super();
		System.out.println("C");
	}
}

	

