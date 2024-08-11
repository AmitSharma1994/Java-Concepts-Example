package com.javaeight.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuesStringStream {

	public static void main(String[] args) {
		String str = "AMit";
		// System.out.println(str.lines().filter(st ->
		// st.matches("AMit")).collect(Collectors.toList()));

		/* Q1.counting the frequency of */
				
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");

		long a = strList.stream().filter(e -> e.isEmpty()).count();

		// Q2.find the string which is contain a

		String[] strArr = { "abcs", "xyz", "pqra", "jklz", "dxat" };

		// o/p->abcs,pqra,dxat

		Arrays.stream(strArr).filter(e -> e.contains("a")).collect(Collectors.toList()).forEach(System.out::println);

		List<String> str3 = Arrays.asList("AU", "AB", "AC", "AD", "AE"); //

		//List<String> str1 = Arrays.asList("abc", "cba");

		// str1.stream().filter(e->e.)

		// filter odd nos and in each odd no add 2

		//List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<String> list = str3.stream().filter(e -> !(e.equals("AU") || e.equals("AB") || e.equals("AE")))
				.collect(Collectors.toList());

		
		
		
		System.out.println(list);

		
		//Q1.Given the list of String and we need to do the Upper letter of all the string persent in the list.
		
				List<String> list2=Arrays.asList("Amit","Java","Spring");
				
				List<String> list1=	list.stream().map(e-> e.toUpperCase()).collect(Collectors.toList());
	}

}
