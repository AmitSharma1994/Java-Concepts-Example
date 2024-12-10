package com.string;

public class ReverseStringifnumber {

	public static void main(String[] args) {
		String str = "The sky1 is blue";
		String reversed = reverseString(str);
		System.out.println(reversed); // Output: "blue is 1yks The"
	}

	public static String reverseString(String str) {
		// Split the string into words
		String[] words = str.split(" ");
		String regex = ".*\\d.*";
		// Reverse each word individually if needed
		for (int i = 0; i < words.length; i++) {

			if (words[i].matches(regex)) {
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}

		}

		// Join the words back together in reverse order
		StringBuilder reversedString = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversedString.append(words[i]);
			if (i != 0) {
				reversedString.append(" ");
			}
		}

		return reversedString.toString();

	}

}
