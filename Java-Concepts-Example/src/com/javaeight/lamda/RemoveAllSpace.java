package com.javaeight.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//finding the max and min word after removing all the multipe space.
public class RemoveAllSpace {
    public static void main(String[] args) {
        String str = "my country               is          india";
        System.out.println(str);
        String[] str1 = str.replaceAll("\\s+", " ").split(" ");

        // long n=Arrays.stream(str1).filter(s->s);

        List<String> list = Arrays.asList(str1);
        String max = list.stream().max(Comparator.comparingInt(String::length)).get();
        //  String max  =list.stream().max((St1,St2)->(St1.compareTo(St2))).get();
        String min = list.stream().min(Comparator.comparingInt(String::length)).get();

        System.out.println(list);

        System.out.println("max string:--" + max);
        System.out.println("min String:--" + min);

       /* System.out.println(n);
        for (String str2:str1)
        System.out.println(str2);*/
    }
}
