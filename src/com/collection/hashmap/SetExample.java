package com.collection.hashmap;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set set=new HashSet();
		
		StringBuilder sb1=new StringBuilder("amit");
		
		StringBuilder sb2=new StringBuilder("amit");
		
		set.add(sb1);
		set.add(sb2);
		
		System.out.println(set.size());
		
		
		
		
	}
}
