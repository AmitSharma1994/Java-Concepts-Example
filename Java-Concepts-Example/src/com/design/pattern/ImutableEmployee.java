package com.design.pattern;

public final class ImutableEmployee {
	private final String name = null;
	private final int age = 0;

	// private Arr
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private ImutableEmployee(int i, String abc) {

	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
	}

	public static void main(String[] args) {
		ImutableEmployee e1 = new ImutableEmployee(10, "abc");

		// System.out.println(e1);

		// System.out.println(e1.getName());
	}
}
