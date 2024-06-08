package com.javaeight.fi;

@FunctionalInterface
interface Addable {
    int add(int a, int b, int c);
}

public abstract class SumoftoNumber implements Addable {

    public static void main(String[] args) {
    	
    	Addable ad = (a, b, c) ->{
        	return c=a+b+c;
        };

		/*	System.out.println(a + b);
			System.out.println(c+"hello");
			

		};*/

       System.out.println(ad.add(10, 20, 30)); ;

    }

	
}
