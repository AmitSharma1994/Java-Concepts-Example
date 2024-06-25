package com.multithred.runnableexm;

public class MultithreadingDemo extends Thread {

	public void run() {
		try {
			
			synchronized (this) {
				sleep(100);
				System.out.println("Thread " + Thread.currentThread().getName() + "is running and ID is "
						+ Thread.currentThread().getId());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		
			MultithreadingDemo md = new MultithreadingDemo();
			md.start();
			
			md.start();

	}
}
