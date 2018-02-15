package com.elife.multithreading;

public class ExtendsThread extends Thread {

	public ExtendsThread() {
		System.out.println("IN Extends Thread Constructor");
	}

	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ExtendsThread : Counter : " + counter);
	}


	public static void main(String[] args) throws InterruptedException {
		
	    //Multiple threads share the same object.
	    ImplementsRunnable rc = new ImplementsRunnable();

		Thread t = new Thread(rc);
		t.start();
		Thread.sleep(1000);
		
		ExtendsThread tc1 = new ExtendsThread();
	     tc1.start();
	     Thread.sleep(1000);
	     
	}

}
