package com.javaeight.lamda;

import java.util.Arrays;

public class ParralelStream {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };

		boolean value = Arrays.stream(arr1).parallel().isParallel();

		System.out.println(value);

		boolean value1 = Arrays.stream(arr1).isParallel();

		System.out.println(value1);

		int sum = Arrays.stream(arr1).parallel().sum();

	}
}
