package com.solidesignprinciple;

import java.util.ArrayList;
class A {
    ArrayList arr = new ArrayList();
    public void add(String s) {
        if (s != null && s.length() > 0) {
            arr.add(s);
        } else {
            System.out.println("Invalid input");
        }
    }
    public void show() {
        for (Object o : arr) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();

        System.out.println(a==a1);

        a.add("Hello");
        a.add(null);
        a.show();
    }
}
