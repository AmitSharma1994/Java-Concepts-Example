package com.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*to sort Employee list on basis of name and id in ascending order by implementing
 Comparator interface and overriding its compare method in java*/
public class EmployeeSortByIDName {
	int id;
	String name;

	public EmployeeSortByIDName(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeSortByIDName{" + "id=" + id + ", name='" + name + '\'' + '}';
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

	public static void main(String[] args) {
		EmployeeSortByIDName em = new EmployeeSortByIDName(1, "Amit");
		EmployeeSortByIDName em2 = new EmployeeSortByIDName(2, "Rahul");
		EmployeeSortByIDName em3 = new EmployeeSortByIDName(3, "pankaj");
		EmployeeSortByIDName em4 = new EmployeeSortByIDName(4, "mukesh");
		List<EmployeeSortByIDName> list = new ArrayList();
		list.add(em);
		list.add(em3);
		list.add(em4);
		list.add(em2);

		System.out.println("before sorting");
		list.stream().forEach(System.out::println);
		System.out.println("after sorting by id");
		Collections.sort(list, new Employeeid());
		list.stream().forEach(System.out::println);
		System.out.println("after sorting by Name");
		Collections.sort(list, new EmplyeeName());
		list.stream().forEach(System.out::println);
	}
}

class Employeeid implements Comparator<EmployeeSortByIDName> {

	@Override
	public int compare(EmployeeSortByIDName o1, EmployeeSortByIDName o2) {
		return o1.id - o2.id;
	}
}

class EmplyeeName implements Comparator<EmployeeSortByIDName> {
	@Override
	public int compare(EmployeeSortByIDName o1, EmployeeSortByIDName o2) {
		return o1.name.compareTo(o2.name);
	}
}