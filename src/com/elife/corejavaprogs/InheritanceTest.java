package com.elife.corejavaprogs;
/**\
 * Final Conclusion : 
 * 1. Always it will call Higher Class Construct first and then others.
 * 2. 
 */
public class InheritanceTest {
	public static void main(String[] args) {
	
		InheritanceTest test = new InheritanceTest();
		
		OldType b = new NewType();
		
		System.out.println("Final Main Methods");
		
	}

	
}

class NewType extends C{
	NewType(){
		super();
		System.out.println("Class B");
		
	}
}
class C extends OldType{
	C(){
	System.out.println("Class C");	
	}
}
class OldType{
	OldType(){
		System.out.println("Class A");
		
	}
}