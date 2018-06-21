package com.elife.corejavaprogs;

public class ThreadIncrementPersistance extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ThreadIncrementPersistance().start();
		new ThreadIncrementPersistance().start();
	}

	static int x,y;
	public synchronized void setX(int i){
		x++;
	}
	public synchronized void setY(int j){
		y++;
	}
	public synchronized void setXY(int i, int j){
		setX(i); setY(j);
	}
	public boolean testXY(){
		return x!=y;
	}
	public void run(){
		setXY(1,2);
		System.out.println(testXY());
	}
	

}
