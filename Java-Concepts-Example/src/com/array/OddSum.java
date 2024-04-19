package com.array;

import java.util.ArrayList;
import java.util.List;

/*find the sum of only odd number from the list/*/

public class OddSum {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(6);

		System.out.println(oddSum(list));

	}

	public static int oddSum(List<Integer> list1) {

		int sum = 0;

		for (Integer Intg : list1) {

			if (Intg % 2 != 0) {
				sum = sum + Intg;
			}

		}
		return sum;
	}
}
