package com.multithred.runnableexm;


class Worker extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println(Thread.currentThread().getName());
	}
	
}

public class Master {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setName("Master");
		
		Thread worker=new Worker();
		
		worker.setName("Worker Thread");
		
		worker.start();
		
	Thread.currentThread().join();
	
	System.out.println(Thread.currentThread().getName());
	
		
		
	}
}
