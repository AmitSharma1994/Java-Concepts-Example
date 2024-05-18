package com.javaeight.lamda;

import java.util.Arrays;
import java.util.List;

public class SmallestPostitive {

    public static void main(String[] args) {


        Integer arr[] = {1, 3, -1, -3, 6, 4, 1, 2};

        List<Integer> integerlist = Arrays.asList(arr);

        //List list=integerlist.stream().sorted().filter(e->e>3).collect(Collectors.toList());

        System.out.println(integerlist.stream().sorted().filter(e->e>=0).findFirst().get());


    }


}
