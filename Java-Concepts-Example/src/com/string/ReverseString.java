package com.string;

import java.util.Collections;
import java.util.Comparator;

public class ReverseString {

    public static void main(String[] args) {

        String str="amit";
        
      str.lines().sorted(Collections.reverseOrder());
        System.out.println(str.lines());
    }


}
