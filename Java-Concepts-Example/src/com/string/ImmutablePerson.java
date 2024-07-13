package com.string;

import java.util.Date;

public final class ImmutablePerson {
	private final String name;
	private final int age;
	private final Date birthDate;

	// Constructor to initialize all fields
	public ImmutablePerson(String name, int age, Date birthDate) {
		if (name == null || birthDate == null) {
			throw new IllegalArgumentException("Name and birthDate cannot be null");
		}
		this.name = name;
		this.age = age;
		// Create a new Date object to ensure the original Date object is not modified
		this.birthDate = new Date(birthDate.getTime());
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Return a copy of the mutable Date object
	public Date getBirthDate() {
		return new Date(birthDate.getTime());
	}

	// Main method to test the immutable class
	public static void main(String[] args) {
		Date birthDate = new Date();
		ImmutablePerson person = new ImmutablePerson("John Doe", 30, birthDate);

		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
		System.out.println("Birth Date: " + person.getBirthDate());

		// Trying to modify the birthDate should not affect the ImmutablePerson object
		birthDate.setTime(0);
		System.out.println("Modified Birth Date: " + birthDate);
		System.out.println("Person's Birth Date: " + person.getBirthDate());
	}
}
