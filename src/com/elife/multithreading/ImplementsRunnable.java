package com.elife.multithreading;

class ImplementsRunnable implements Runnable {

	  private int counter = 0;

	  public void run() {
	    counter++;
	    System.out.println("ImplementsRunnable : Counter : " + counter);
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
