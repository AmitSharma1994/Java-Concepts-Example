package com.output.question;

public class Test1 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {

        Test1 t1 = new Test1();
        t1.a = 100;     //this will be override the value of a
        t1.b = 200;     // this is will
        Test1 t2 = new Test1();
        System.out.println("t1.a =" + t1.a + " t1.b =" + t1.b);
        System.out.println("t2.a =" + t2.a + " t2.b =" + t2.b);
    }
}
