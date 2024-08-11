package com.javaeight.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		String str = "AmitKumarSharma";

		// reversing the character on the basis of Ashci value.
		List<Character> list = str.chars().mapToObj(ch -> Character.toLowerCase((char) ch))
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());

		System.out.println(list);

		char[] ch = str.toCharArray();

		int[] arr = { 1, 2, 3, 4 };

		List list1 = Arrays.asList(ch);

		List list2 = Arrays.asList(arr);

		// Object list2=
		// list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		// System.out.println(list2.toString());

	}
}
