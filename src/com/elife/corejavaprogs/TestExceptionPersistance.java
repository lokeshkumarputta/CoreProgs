package com.elife.corejavaprogs;

public class TestExceptionPersistance {

	public static void main(String[] args) {
		
		TestExceptionPersistance exp = new TestExceptionPersistance();
		
		System.out.println(exp.functionA());
	}

	private int functionA() {
		try{
			throw new Exception("error");
		}catch(Exception ex){
			return 5;
		}finally{
			return 10;
		}
		
	}
}
