package com.output.question;
//a) Compilation error
//b) 5
//c) Runtime error
//d) None of these
class Helper {
    private int data;

    private Helper() {
        data = 5;
    }
}

public class Test7 {
    public static void main(String[] args) {
       // Helper help = new Helper();
        //System.out.println(help.data);
    }
}
