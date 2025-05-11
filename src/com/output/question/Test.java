package com.output.question;

public class Test {
	
	public static int x;
	public int y;
	
	public static void main(String[] args) {
		
		Test t1 = new Test();

		t1.x = 10;
		t1.y = 20;

		Test t2 = new Test();

		t2.x = 30;
		t2.y = 40;

		System.out.println(t1.x);  //
		System.out.println(t1.y); //20
		
		
		System.out.println(t2.x);  //  
		System.out.println(t2.y);  //40
		 
	}

}
