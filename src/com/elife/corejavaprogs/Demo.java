package com.elife.corejavaprogs;

public class Demo {
	static int i = 0;
	
	static int f1() {
		i++;
		return i;
	}
	

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.f1();
		int j = demo.f1();
		System.out.println(j);
	}

}
