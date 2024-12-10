package com.javaeight.lamda.groupby;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Grouping the String on the basis of anagram.
////Input: strs = ["eat","tea","tan","ate","nat","bat"]
////Output: [["bat"],["nat","tan"],["ate","eat","tea"]] 
public class GroupingAnagram {
	
	
	public static void main(String[] args) {
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(getAnagram(strs));
	}

	static List<List<String>> getAnagram(String[] strs){
		
		List<List<String>> list=	Arrays.stream(strs).collect(Collectors.groupingBy(str->{
			
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			return new String(ch);
			
			})).values().stream().collect(Collectors.toList());
		
		return list;
		
	}
}
