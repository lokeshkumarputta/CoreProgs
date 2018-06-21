package com.elife.collections;

import java.util.ArrayList;
import java.util.List;


public class InterfaceTestPersistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<? extends Chewable> list1 = new ArrayList<Meat>();
		List<Chewable> list2 = new ArrayList<Chewable>();
		
		Meat meat = new Meat();
//		list1.add(meat);  //Compilation error will come because we cant add meat into the list but we can add Meat 
		list2.add(meat);
	}
	
	

}
