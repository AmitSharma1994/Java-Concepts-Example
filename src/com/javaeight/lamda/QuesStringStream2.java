package com.javaeight.lamda;

import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;

public class QuesStringStream2 {

    String input = "Java Hungry Blog Alive is Awesome";

//firstnon repative chareacter in

    String[] str = input.split(" ");

    String max = Arrays.stream(str).max(Comparator.comparingInt(String::length)).get();


    String min = Arrays.stream(str).min(Comparator.comparingInt(String::length)).get();



    Map<Character, Long> map = input.chars().mapToObj(ch -> Character.toLowerCase((char) ch)).filter(e -> e != ' ')
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

    // Map<Character,Long> map
    // =input.chars().mapToObj(ch->Character.toLowerCase((char)ch)).filter(e->e!='
    // ').
    // collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));



    char ch = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(e -> e.getKey()).get();

		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(e -> e.getKey()).findAny().get();

    List<Character> list = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(e -> e.getKey())
            .collect(Collectors.toList());



}


