package com.elife.multithreading;

public class ThreadTest  implements Runnable{

	
	public static void main(String[] args) {
		
		ThreadTest test = new ThreadTest();
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.start();
		t2.start();
	}

	int a , b;
	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			synchronized (this) {
				a = 18; 
				b = 18;
			}
			System.out.println(a +" " + b + " ");
		}
	}
}
