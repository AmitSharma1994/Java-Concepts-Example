package com.javaeight.lamda;

import java.util.Arrays;
import java.util.stream.Collectors;
//given list and finding the match charachter.
public class MatchCharfind {
    public static void main(String[] args) {

        String[] lsit ={"abcs","xyz","pqra","jklz","dxat"};

        //o/p->abcs,pqra,dxat

      Arrays.stream(lsit).filter(e->e.contains("a")).
              collect(Collectors.toList()).
              forEach(System.out::println);

    }
}
