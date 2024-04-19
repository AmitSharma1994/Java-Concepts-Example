package com.javaeight.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//Q1.   Reverse of the list usnig stream function
//Q2.   Find the First maximu element.
//Q3.   Find the first three number.
//Q4.   Find the second largest number using skip method.
public class Listsorting {


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        /*1. reverse of the list usnig stream function*/
        list.stream().sorted(Collections.reverseOrder()).
                forEach(System.out::println);
        //2. maximumm number from list using max function.
        System.out.println(list.stream().max((i1, i2) -> (i1.compareTo(i2))).get());
        System.out.println("other way for finding the first element"+list.stream().sorted(Collections.reverseOrder()).findFirst().get());
        //3.First Three number will print using limit method.
        list.stream().sorted(Collections.reverseOrder()).limit(3).
                forEach(e -> System.out.println(e));
        //4. second maximum number from list.
        System.out.println(list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());

    }

}
