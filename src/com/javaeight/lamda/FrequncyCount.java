package com.javaeight.lamda;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
String str="Move Money - Faster"
Output => {A=1, R=1, S=1, T=1,E=3, F=1, V=1, Y=1, M=2, O=2}
*/

public class FrequncyCount {

	public static void main(String[] args) {
		String str = "Move Money - Faster";

		// Use streams to count character frequencies
		Map<Character, Long> charFrequencyMap = str.chars()
				// Convert IntStream to Stream<Character>
				.mapToObj(c -> (char) c)
				// Filter out spaces
				.filter(c -> c != ' ')
				// Collect into a map with character as key and frequency as value
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Print the character frequencies
		// charFrequencyMap.forEach((key, value) -> System.out.println("'" + key + "' :
		// " + value));

		/*
		for (Entry<Character, Long> entry : charFrequencyMap.entrySet()) {

			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

		 */
		
		charFrequencyMap.forEach((key,value)-> System.out.println("'"+key+"'" +value));
		
		
	}
}
