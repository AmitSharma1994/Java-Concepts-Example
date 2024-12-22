package com.javaeight.lamda;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCounting {
    public static void main(String[] args) {
        String str ="COunteachCharacter";




        str.chars().mapToObj(e-> e+" ").forEach(e->{
            System.out.println(e);
        });



        Map<Character,Long> map2=str.chars().mapToObj(e->Character.toLowerCase((char)e)).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map2.forEach((e1,e2)->{
            System.out.println(e1+""+e2);
        });



    }

}
