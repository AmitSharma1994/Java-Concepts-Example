package com.output.question;

//a) Constructor called Method called
//b) Compilation error
//c) Runtime error
//d) None of the above

class Temp {
    public Temp() {
        System.out.printf(" no arg Constructor called ");
    }

    private Temp(int data) {
        System.out.printf(" arg Constructor called ");
    }

    protected static Temp create(int data) {
       // Temp obj = new Temp();   //construter is calling at the object insantioantion
        Temp obj = new Temp(data);
        return obj;
    }

    public void myMethod() {
        System.out.printf(" Method called ");
    }
}

public class Test8 {
    public static void main(String[] args) {

        Temp obj = Temp.create(20);
        obj.myMethod();
    }
}