package com.pattern.example;

public class NumberSequencePrinting {
	
	public static void main(String[] args) {
	
		 // i/p: 4;
		// n=15
		// 4 3 2 1 2 3 4 3 2 1 2 3 4 3 2 ..... n
		
		int n=4;
		int m=15;
		int flag=1;
		
		for(int i=0;i<m;i++) {
			
			System.out.print(n);
			
			if(n>1) {
				System.out.print(n--);
			}
			else {
				System.out.print(n++);
			}
		}
		
		
		
	}

}
