package com.multithred.runnableexm;

public class MultithreadingDemo extends Thread {

	public void run() {
		try {
			System.out.println("Thread" + Thread.currentThread().getName() + "is running and ID is "
					+ Thread.currentThread().getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
			MultithreadingDemo md = new MultithreadingDemo();
			md.start();
		}

	}
}
