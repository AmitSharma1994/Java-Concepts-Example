package com.javaeight.lamda;

import java.util.stream.Collectors;

public class StringStream {

    public static void main(String[] args) {
        String str = "AMit";
        System.out.println(str.lines().filter(st -> st.matches("AMit")).collect(Collectors.toList()));
    }

}
