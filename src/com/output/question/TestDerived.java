package com.output.question;

/*a) Test class Derived class
b) Derived class Test class
c) Compilation error
d) Runtime error*/

class Derived1 {
    public void getDetails() {
        System.out.printf("Derived class ");
    }
}

public class TestDerived extends Derived {
    public void getDetails() {
        System.out.printf("Test class ");
       // super.getDetails();
    }

    public static void main(String[] args) {
       // Derived1 obj = new TestDerived();
      //  obj.getDetails();
    }
}