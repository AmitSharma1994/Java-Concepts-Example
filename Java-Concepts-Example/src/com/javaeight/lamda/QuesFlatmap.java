package com.javaeight.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class QuesFlatmap {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4 }, { 5, 6 } };

		int[] arr1 = { 1, 2, 3, 4, 5 };

		int suminoned = Arrays.stream(arr1).sum();

		int sum = Arrays.stream(arr).flatMapToInt(Arrays::stream).sum();

		OptionalDouble avj = Arrays.stream(arr).flatMapToInt(Arrays::stream).average();

		System.out.println(sum);

//.list.stream().flatMapToInt(Arrays::stream).sum();
	}
}
