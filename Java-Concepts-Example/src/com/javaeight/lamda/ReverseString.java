package com.javaeight.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		String str = "AmitKumarSharma";
		//List<Character> list = str.chars().mapToObj(ch -> (char) ch).sorted(Collections.reverseOrder())
			//	.collect(Collectors.toList());
		//System.out.println(list);
		
		char[] ch=str.toCharArray();
		
	List list=Arrays.asList(ch);
	
	Object list2= list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(list2.toString());
		
		
	}
}
