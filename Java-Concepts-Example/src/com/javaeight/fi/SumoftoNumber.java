package com.javaeight.fi;

@FunctionalInterface
interface Addable {
    void add(int a, int b, String name);
}

public class SumoftoNumber {

    public static void main(String[] args) {
        Addable ad = (a, b, c) -> System.out.println(a + b);

		/*	System.out.println(a + b);
			System.out.println(c+"hello");
			

		};*/

        ad.add(10, 20, "amit");

    }
}
