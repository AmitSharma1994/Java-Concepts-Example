package com.javaeight.lamda;
/*
1.Using loops (Naive Approach)
    For loop
	For-each loop  //Enhance for loop
	While loop
2.Using Iterator
3.Using List iterator
4.Using lambda expression it is available in onword java8
5.Using stream.forEach()it is available in onword java8

*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Amit");
        list.add("Kumar");
        list.add("Sharma");
        list.add("Nucleus");
        list.add("Sofware");

        // Iteration usiing loop
        // 1.a for loop
        System.out.println("1.a using for loop");
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
        System.out.println("----------------------------");
        //1.b using for-each loop
        System.out.println("//1.b using for-each loop");


        for (String ls : list) {
            System.out.println(ls);
        }
        System.out.println("----------------------------------");

        //1.c using for-each loop
        System.out.println("//1.c using while loop");
        int j = 0;
        while (j < list.size()) {
            System.out.println(list.get(j));
            j++;
        }

        System.out.println("----------------------------------");

        //2 using Iteretor
        System.out.println("//2 using Iteretor");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        System.out.println("-----------------------------");

        //3 using ListIteretor
        System.out.println("//3 using List Iteretor");

        ListIterator<String> litr = list.listIterator();

        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("-----------------------------");


        //4 using foreach lamdaexpression
        System.out.println("//4 using foreach lamdaexpression");

        list.forEach(temp -> {
            System.out.println(temp);
        });

        System.out.println("-----------------------------");


        //5 using foreach Stream API
        System.out.println("//5 using foreach Stream API");
        list.stream().forEach(temp -> {

            System.out.println(temp);
        });


        System.out.println("-----------------------------");

    }
}
