package com.javaeight.lamda;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepatingWord {
	public static void main(String[] args) {
		
		String str="Geeks for Geeks";
		
		String[] str1=str.split(" ");
		
	        Map<String,Long> map = Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	
	       List<String> list= map.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());
	       System.out.println(list);
	
	}

}
