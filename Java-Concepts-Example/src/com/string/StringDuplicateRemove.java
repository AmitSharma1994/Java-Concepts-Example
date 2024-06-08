package com.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StringDuplicateRemove {
	
	static String str="aabbccc";

	static char[] ch=str.toCharArray();
	
	public static void main(String[] args) {
		
	 HashSet<Character> hs=new HashSet<>();
	
	 try {
		for(char ch1:ch) {
			hs.add(ch1);
			 
		 }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 hs.forEach(System.out::print);
	 
	 hs.forEach(e->System.out.print(e));
	 
		System.out.println();
		
		//using Stream
		
		//converted in intStream from String using chars() method.
		//after that we are calling maptoobj and each element asci valude integer value to casting in charter
		System.out.println(str.chars().mapToObj(ch->ch).collect(Collectors.toList()));
		
		//collecting the stream value in List.
		List<Integer> list=str.chars().mapToObj(ch->ch).collect(Collectors.toList());
		
		//collecting the stream value in List so it will not remove all the duplicate value.
		System.out.println(str.chars().mapToObj(ch->(char)ch).collect(Collectors.toList()));
		
		
		List<Character> listchar=  str.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
		System.out.println("listcahr:-"+listchar);
		
		//collecting the stream value in set so it will remove all the duplicate value. 
		System.out.println(str.chars().mapToObj(ch->(char)ch).collect(Collectors.toSet()));
		
		
	}
}
