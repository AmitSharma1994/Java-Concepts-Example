package com.javaeight.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//finding the max and min word after removing all the multipe space.
public class FindMinandMaxword {
    public static void main(String[] args) {
        String str = "my country               is          india";
        System.out.println(str);
        String[] str1 = str.replaceAll("\\s+", " ").split(" ");

        // long n=Arrays.stream(str1).filter(s->s);

        List<String> list = Arrays.asList(str1);
        String max = list.stream().max(Comparator.comparingInt(String::length)).get();
        //  String max  =list.stream().max((St1,St2)->(St1.compareTo(St2))).get();
        String min = list.stream().min(Comparator.comparingInt(String::length)).get();

        String min1  =list.stream().max((St1,St2)->(St1.compareTo(St2))).get();
        
        System.out.println(list);

        System.out.println("max string:--" + max);
        System.out.println("min String:--" + min);
        System.out.println("min1 String:--" + min1);
        
        
        List<String> words = Arrays.asList("spring", "java", "jpa", "hibernate");
        String maxsting=words.stream().max((e1,e2)->(e1.compareTo(e2))).get();
        
        String maxsting1=words.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println(maxsting1);
       // words.stream().min(null).

       /* System.out.println(n);
        for (String str2:str1)
        System.out.println(str2);*/
    }
}
