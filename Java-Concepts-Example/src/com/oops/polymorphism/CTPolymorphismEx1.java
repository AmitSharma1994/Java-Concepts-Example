package com.oops.polymorphism;
//overloading between parent class and child class Relation ship.
class Parent {
	public static void show() {
		System.out.println("Parent's show()");
	}
}

class Child extends Parent {
	public static void show() {
		System.out.println("Child's show()");
	}
}

public class CTPolymorphismEx1 {

	public static void main(String[] args) {

		Parent p=new Child();
		
		p.show();
	}
}



//output will be Parent.