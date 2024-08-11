package com.exception;

public class ExceptionExample {

	public static void main(String[] args) {

		ExceptionExample ex = new ExceptionExample();

		System.out.println(ex.m1());

	}

	int m1() {

		try {

			return 10;
		}

		catch (Exception e) {

			e.printStackTrace();

			return 20;

		} finally {
			System.out.println("Finally Block");
			return 30;
		}
		// return 0;
	}

}