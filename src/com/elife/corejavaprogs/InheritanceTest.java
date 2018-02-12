package com.elife.corejavaprogs;
/**\
 * Final Conclusion : 
 * 1. Always it will call Higher Class Construct first and then others.
 * 2. 
 */
public class InheritanceTest {
	public static void main(String[] args) {
	
		InheritanceTest test = new InheritanceTest();
		
		A b = new B();
		
		System.out.println("Final Main Methods");
		
	}

	
}

class B extends C{
	B(){
		super();
		System.out.println("Class B");
		
	}
}
class C extends A{
	C(){
	System.out.println("Class C");	
	}
}
class A{
	A(){
		System.out.println("Class A");
		
	}
}