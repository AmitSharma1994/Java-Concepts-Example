package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ServiceClass {

	public static void main(String[] args) {

		String str = "amitkumarsharma";

		//find the first non repeted charcter
		
		Optional<Character> ch = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst();

		/*
		 * map.forEach((ch1, in) -> { System.out.println(ch1 + "  " + in); });
		 */
		
		System.out.println(ch.get());
		
		//find the first repeted character
		
		Map<Character, Long> map1 = str.chars().mapToObj(e -> (char) e)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		map1.forEach((cha, val) -> {
			System.out.println(cha + "  " + val);
		});

		Optional<Character> ch1 = map1.entrySet().stream().filter(entry -> entry.getValue() >=2).map(e -> e.getKey())
				.findFirst();

		System.out.println(ch1.get());

		

	

		List<Integer> list = Arrays.asList(1, 2, 5, 4, 6, 3, 6, 5);

		// o/p=5,6
		
		
		
		
		Map<String, Integer> hs1 = new HashMap<>();

		hs1.put("abc", 15);
		hs1.put("def", 45);
		hs1.put("ghi", 15);
		hs1.put("efg", 15);

		List<String> list1 = hs1.entrySet().stream().filter(e -> e.getValue() == 15).map(e -> e.getKey())
				.collect(Collectors.toList());

	
		HashSet<Integer> hs = new HashSet<>();

		List<Integer> lis1 = list.stream().filter(e -> !hs.add(e)).collect(Collectors.toList());

		System.out.println(lis1);

	}

}