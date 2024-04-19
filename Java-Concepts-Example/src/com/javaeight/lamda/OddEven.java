package com.javaeight.lamda;

/* Given a list of integers, find out all the even numbers exist in the list using Stream functions?*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 55, 60, 70);

        List<String> list1 = list.stream().map(s -> s + "")
                .filter(s -> s.startsWith("1")).collect(Collectors.toList());


    }

}
