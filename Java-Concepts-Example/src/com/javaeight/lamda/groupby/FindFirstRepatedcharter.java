package com.javaeight.lamda.groupby;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepatedcharter {

	public static void main(String[] args) {
		
 String input = "Java Hungry Blog Alive is Awesome";
		 
		 //first conveting String to charArray then collecting in list using comma,
		 
		// System.out.println(input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))).collect(Collectors.toList()));

		 //System.out.println("");
		 
		 //This will be return the list of character off all the string.
		 
		// System.out.println(input.chars().mapToObj(s -> Character.toLowerCase((char) s)).collect(Collectors.toList()));
		 
		// System.out.println("");
		 
		 
		 //this used fileter space
		// System.out.println(input.chars().mapToObj(s -> (char) s).filter(e->e.charValue()!= ' ').collect(Collectors.toList()));	
		 
		 
		 
		 //Character result = input.chars().mapToObj(s -> Character.toLowerCase((char) s))
		 
	        Character result = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
	                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	                .entrySet().stream(). //we are taking the entryset of MAP and now making stream 
	                filter(entry -> entry.getValue() > 1L) //we are filtering condition on either on key or value.  ==1L for non-repeting and 
	                .map(entry -> entry.getKey())  //using map for converting in to
	                .findFirst().get();// get the find first element 
	        System.out.println(result);
	}
}
