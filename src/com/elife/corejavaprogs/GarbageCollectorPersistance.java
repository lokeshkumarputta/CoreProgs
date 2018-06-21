package com.elife.corejavaprogs;

public class GarbageCollectorPersistance {
	
	public static void main(String[] args) {
		
		GarbageCollectorPersistance g = new GarbageCollectorPersistance();
		
		g.method1();
		
		System.out.println("::" +g );
	}

	Object method1() {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Object[] obj2 = new Object[1];
		
		obj2[0] = obj1;
		obj1 = null;
		return obj2[0];
		
		
		
				
				
		
	}

}
