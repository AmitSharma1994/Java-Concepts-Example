package com.javaeight.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveMostFrequent {

	public static void main(String[] args) {

		/*
		
		//		int[] array = {1, 2, 3, 4, 3, 5, 5, 6, 7, 3, 5, 3, 5, 3};
	        //IntStream intStream=	Arrays.stream(array);
	
		Integer[] array = {1, 2, 3, 4, 3, 5, 5, 6, 7, 3, 5, 3, 5, 3};
		
		List<Integer> list=Arrays.asList(array);
		
     // Map<Integer,Long> map=list.stream()
    	//	  					.collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
      Map<Integer,Long> map=list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().map(e->e.g)

		
      
      map.forEach((key,value)->System.out.println(""+key+" "+value));
      
*/      
		
	
	//Map<Integer,log>	frequecymap= list.collect(Collectors.groupingBy(e->e,Collectors.counting()));
	
	
	//list.collect((Supplier<R>) Function.identity(), LinkedHashMap::new, (BiConsumer<R, R>) Collectors.counting());
	
	//list.stream().collect(Collectors.toMap(Function.identity(), null))
	
	 //Object  map=
		//	 list.stream().mapToInt((Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));
      
      
      Integer[] array = {1, 2, 3, 4, 3, 5, 5, 6, 7, 3, 5, 3, 5, 3};
      
      // Count the frequency of each element in the array
      Map<Integer, Long> frequencyMap = Arrays.stream(array)
          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      
      
      
      
      // Find the most frequent element
      Integer mostFrequentElement = frequencyMap.entrySet().stream()
          .max(Map.Entry.comparingByValue())
          .map(Map.Entry::getKey)
          .orElse(null);
      
      // Remove the most frequent element
      Integer[] newArray = Arrays.stream(array)
          .filter(e -> !e.equals(mostFrequentElement))
          .toArray(Integer[]::new);
      
      // Print the new array
      System.out.println(Arrays.toString(newArray));
  }

}