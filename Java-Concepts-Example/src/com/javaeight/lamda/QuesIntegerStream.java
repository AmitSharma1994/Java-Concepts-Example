package com.javaeight.lamda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*1. Given a list of integers, find out all the even numbers exist in the list.
        /*2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/
/*Q3 How to find duplicate elements in a given integers using hasmap or distch function list in java using Stream functions?
Q4 Given the list of integers, find the first element of the list using Stream functions?
Q5 Given a list of integers, find the total number of elements present in the list using Stream functions.
Q6 Given a list of integers, find the maximum value element present in it using Stream functions
Q7 Given a String, find the first non-repeated character in it using Stream functions.
Q8 Given a String, find the first non-repeated character in it using Stream functions.
Q9 Given a list of integers, sort all the values present in it using Stream functions.
Q10 Given a list of integers, sort all the values present in it in descending order using Stream functions
 */
public class QuesIntegerStream {

    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(10, 20, 30, 40, 5, 7);
        /*1. Given a list of integers, find out all the even numbers exist in the list
                using Stream functions?*/
        List<Integer> list1 = mylist.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        //list.stream().filter(e->e%2==0).forEach(System.out::println);
        System.out.println(list1);

        /*2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?*/

        List<String> list2 = mylist.stream().map(e -> e + "").filter(e -> e.startsWith("1")).collect(Collectors.toList());

        System.out.println(list2);

        /*Q3 How to find duplicate elements in a given integers list in java using Stream functions?*/
        List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        HashSet<Integer> hashSet = new HashSet<>();

        List<Integer> list3 = myList3.stream().filter(e -> !hashSet.add(e)).collect(Collectors.toList());
        System.out.println(list3);

        /*Q4 Given the list of integers, find the first element of the list using Stream functions?*/
        List<Integer> myList4 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        Optional<Integer> n = myList4.stream().findFirst();


        if (n.isPresent()) {
            System.out.println(n.get());
        }

        /*Q5 Given a list of integers, find the total number of elements present in the list using Stream functions?*/

        List<Integer> myList5 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(myList5.stream().count());

        /*Q6 Given a list of integers, find the maximum value element present in it using Stream functions?*/

        List<Integer> myList6 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(myList6.stream().max(Integer::compareTo).get());

        /*Q9 Given a list of integers, sort all the values present in it using Stream functions?*/

        List<Integer> myList9 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        System.out.println(myList9.stream().sorted().collect(Collectors.toList()));


        /*Q10 Given a list of integers, sort all the values present in it in descending order using Stream functions?*/

        List<Integer> myList10 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(myList10.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));

      

    }
}
