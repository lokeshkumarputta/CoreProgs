package com.elife.multithreading;

public class DedlockProgs {

	
	String str1 = "java";
	String str2 = "Android";
	
	Thread t1 = new Thread("My Thread1") {
		public void run() {
			while(true) {
				synchronized(str1) {
					synchronized (str2) {
						System.out.println(str1 + " ::" +  str2);
					}
				}
			}
		}
	};
	
	Thread t2 = new Thread("My Thread2"){
		public void run() {
			while(true) {
				synchronized(str2) {
					synchronized (str1) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};
	
	
	public static void main(String[] args) {

		DedlockProgs dl = new DedlockProgs();
		
		dl.t1.start();
		dl.t2.start();
	}

}
