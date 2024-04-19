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
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		int[] array = {1, 2, 3, 4, 3, 5, 5, 6, 7, 3, 5, 3, 5, 3};
	//IntStream intStream=	Arrays.stream(array);
	
		Integer[] array = {1, 2, 3, 4, 3, 5, 5, 6, 7, 3, 5, 3, 5, 3};
		
		List list=Arrays.asList(array);
		
	
	//Map<Integer,log>	frequecymap= list.collect(Collectors.groupingBy(e->e,Collectors.counting()));
	
	
	//list.collect((Supplier<R>) Function.identity(), LinkedHashMap::new, (BiConsumer<R, R>) Collectors.counting());
	
	//list.stream().collect(Collectors.toMap(Function.identity(), null))
	
	 //Object  map=
			 list.stream().mapToInt((Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));
	}

}
