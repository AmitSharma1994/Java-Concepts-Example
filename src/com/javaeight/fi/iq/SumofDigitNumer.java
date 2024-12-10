package com.javaeight.fi.iq;
//find the sum of number using java 8 Stream API.
public class SumofDigitNumer {

	public static void main(String[] args) {
		String n="A";
		
		//int sum=String.valueOf(n).chars().map(Character::getNumericValue).sum();
		int sum=	n.chars().map(e->Character.getNumericValue(e)).sum();
		System.out.println(sum);
	}
	
}
