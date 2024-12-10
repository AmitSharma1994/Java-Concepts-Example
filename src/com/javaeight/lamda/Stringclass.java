package com.javaeight.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stringclass {

	public static void main(String[] args) {
		//String str="amit";
		
		List<String> list2=Arrays.asList("Amit","Java","Spring");
		
	
		
		List<String> list=list2.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(list);
		
		//Character.toUpperCase()
		
		//str.chars().mapToObj(e->Character.toUpperCase(e))).collect
		
		//List<Character> list= str.chars().mapToObj(e->Character.toUpperCase((char)e)).collect(Collectors.toList());
		
		//String list= str.chars().mapToObj(e->Character.toUpperCase((char)e)).toString();
		
		
	}
}
