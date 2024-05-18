package com.array.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
		array1 ==> 1,3,4,4,6,7
		array2 ==> 2,3,5,5
		output array3 ==> 1,2,3,4,5,6,7
		*/

//Sum of Square of all the odd numbers from the list
public class MergeArray {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7);
		
		List<Integer>list1= list.stream().filter(e->e%2!=0).map(e1->e1*e1).collect(Collectors.toList());
		 
		
		System.out.println(list1);
		
	}
}
