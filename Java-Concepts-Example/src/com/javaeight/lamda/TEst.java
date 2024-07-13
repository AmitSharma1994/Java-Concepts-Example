package com.javaeight.lamda;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;

public class TEst {

	public static void main(String[] args) {
		int[] array1 = {1, 3, 5, 7};       
		
		int[] array2 = {2, 4, 6, 8};

//IntStream.concat(array, null)
		//Arrays.stream(array1).;

		int[] arr= {1, 2, 3, 4, 5, 6, 7, 8,9,10};

       Arrays.stream(arr).filter(e->(e%1==0 && e%e==0)).forEach(e->{
    	   System.out.println(e);
       });;
  
		 
		
  

//Finding prime numbers using Java8

  



	}
}
