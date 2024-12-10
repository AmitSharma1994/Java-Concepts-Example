package com.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortbyinnerclass {
	int id;
	String name;

	public EmployeeSortbyinnerclass(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeSortbyinnerclass{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	static class Employeeidic implements Comparator<EmployeeSortbyinnerclass> {

		@Override
		public int compare(EmployeeSortbyinnerclass o1, EmployeeSortbyinnerclass o2) {
			return o1.id - o2.id;
		}
	}

	static class EmployeeNameic implements Comparator<EmployeeSortbyinnerclass> {

		@Override
		public int compare(EmployeeSortbyinnerclass o1, EmployeeSortbyinnerclass o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	public static void main(String[] args) {
		EmployeeSortbyinnerclass em = new EmployeeSortbyinnerclass(1, "Amit");
		EmployeeSortbyinnerclass em2 = new EmployeeSortbyinnerclass(2, "Rahul");
		EmployeeSortbyinnerclass em3 = new EmployeeSortbyinnerclass(3, "pankaj");
		EmployeeSortbyinnerclass em4 = new EmployeeSortbyinnerclass(4, "mukesh");
		List<EmployeeSortbyinnerclass> list = new ArrayList();
		list.add(em);
		list.add(em3);
		list.add(em4);
		list.add(em2);
		System.out.println("before sorting");
		list.stream().forEach(System.out::println);
		System.out.println("After sorting by id");
		Collections.sort(list, new Employeeidic());
		list.stream().forEach(System.out::println);
		System.out.println("After sorting by Name");
		Collections.sort(list, new EmployeeNameic());
		list.stream().forEach(System.out::println);

	}
}
