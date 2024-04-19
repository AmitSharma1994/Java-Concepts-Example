package com.javaeight.lamda;

import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        String str = "AmitKumarSharma";
        str.lines().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
