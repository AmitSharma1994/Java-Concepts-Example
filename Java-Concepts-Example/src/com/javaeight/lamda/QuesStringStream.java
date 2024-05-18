package com.javaeight.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuesStringStream {

    public static void main(String[] args) {
        String str = "AMit";
        //System.out.println(str.lines().filter(st -> st.matches("AMit")).collect(Collectors.toList()));
        
        /*Q1.counting the frequency of    */

        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");


       long a=  strList.stream().filter(e -> e.isEmpty()).count();
       
       
       //Q2.find the  string which is contain a
       
       
       String[] strArr ={"abcs","xyz","pqra","jklz","dxat"};

       //o/p->abcs,pqra,dxat

       		Arrays.stream(strArr).filter(e->e.contains("a")).
             collect(Collectors.toList()).
             forEach(System.out::println);

   }
       
       
    }


