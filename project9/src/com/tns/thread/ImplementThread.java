package com.tns.thread;

public class ImplementThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable interface");
		
	}
    public static void main (String args[]) {
	ImplementThread ob = new ImplementThread();
	Thread t= new Thread(ob);
	t.start();
	}
	
}
