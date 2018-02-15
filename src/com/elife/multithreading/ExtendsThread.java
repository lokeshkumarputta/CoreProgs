package com.elife.multithreading;

public class ExtendsThread extends Thread{

	public ExtendsThread() {
		System.out.println("IN Extends Thread Constructor");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	public static void main(String[] args) {

		Thread t = new Thread();
		t.start();
	
		ExtendsThread threadObj = new ExtendsThread();
	}

}
