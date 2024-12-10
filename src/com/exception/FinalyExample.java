package com.exception;


//This is the example of finally and multiple return statement if 
public class FinalyExample {
	
	public static void main(String[] args) {
	
		System.out.println(m1());
}

	static	int m1() {
	
		try {
			
			//System.exit(0);
			
			throw new Exception("error");
		}
		catch(Exception ex){
		
			//throw new Exception("error");
			System.out.println("catch");
			
			return 1;
		}
		finally {
			System.out.println("finally");
			return 2;
		}
	}
	
}
