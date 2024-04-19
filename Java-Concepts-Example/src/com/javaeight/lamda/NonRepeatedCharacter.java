package com.javaeight.lamda;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {
	public static void main(String[] args) {
		 String input = "Java Hungry Blog Alive is Awesome";
		 
		 //first conveting String to charArray then collecting in list using comma,
		 
		 System.out.println(input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))).collect(Collectors.toList()));

		 //Character result = input.chars().mapToObj(s -> Character.toLowerCase((char) s))
		 
	        Character result = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
	                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	                .entrySet().stream().
	                filter(entry -> entry.getValue() == 1L)
	                .map(entry -> entry.getKey())
	                .findFirst().get();
	        System.out.println(result);
	 
	        
	}

}
