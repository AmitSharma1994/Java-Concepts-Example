package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceClass {

	
	public static void main(String[] args) {
		
		
	List<String> str= Arrays.asList("AU","AB","AC","AD","AE") ; //
	
	List<String> str1= Arrays.asList("abc" , "cba") ;
	
	//str1.stream().filter(e->e.)
	
	//filter odd nos  and in each odd no add 2
	
	List<Integer>  list1=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
	List<String>	list=str.stream().filter(e-> !(e.equals("AU")||e.equals("AB")||e.equals("AE"))).collect(Collectors.toList());
		
		 System.out.println(list);
		 
		 
		 
		//print list AU , AB,AE
		 
		 
		 //filter odd nos  and in each odd no add 2
		 
		//List<Integer> list2=list1.stream().filter(e-> e%2!=0).collect(Collectors.toList()).stream().map(e->e+2).collect(Collectors.toList());
		 
		 List<Integer> list2=list1.stream().filter(e-> e%2!=0).map(e->e+2).collect(Collectors.toList());
		 
		System.out.println(list2);
		
		//"abc"  "cba";
		
	}
	
	
	
}
         