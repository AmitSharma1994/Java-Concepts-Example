package com.multithred;

public class ThreadEx extends Thread {

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
		
		
		ThreadEx md = new ThreadEx();
			md.start();
			
		//	md.start();

	}
}
