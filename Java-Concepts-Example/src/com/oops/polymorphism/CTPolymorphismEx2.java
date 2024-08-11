package com.oops.polymorphism;

class ParentRuntime{
	
	public void foo(ParentRuntime p) {
		
		System.out.println("Parent");
		
	}
}

class ChildRuntime extends ParentRuntime{
	
	
	public void foo(ChildRuntime ch) {
		System.out.println("chiild");
	}
}


public class CTPolymorphismEx2 {

	public static void main(String[] args) {
		
		ParentRuntime p=new ChildRuntime();
		
		
		ParentRuntime p1=null;
		ChildRuntime c1=new ChildRuntime();
		p.foo(c1);
	}
}
