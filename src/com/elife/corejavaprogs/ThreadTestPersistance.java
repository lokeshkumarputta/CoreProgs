package com.elife.corejavaprogs;

public class ThreadTestPersistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = new Thread(){
		public void run(){
			try{
				System.out.println("After t started");
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
			
		};
		t.start();
		t.notify();
	}

}
