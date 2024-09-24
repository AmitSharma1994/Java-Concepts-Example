package com.multithred;

public class RunnableEx implements Runnable {
	
	public static void main(String[] args) {
		
		RunnableEx re=new RunnableEx();
		
		Thread th=new Thread(re);
		
		th.start();
		
		
	}

	@Override
	public void run() {
		System.out.println("Run method is calling by " +Thread.currentThread().getName());
		
	}

}
