package com.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortbyName implements Comparable<EmployeeSortbyName> {

	int id;
	String name;
	String dep;
	int salary;

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

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeSortbyName{" + "id=" + id + ", name='" + name + '\'' + ", dep='" + dep + '\'' + ", salary="
				+ salary + '}';
	}

	public EmployeeSortbyName(int id, String name, String dep, int salary) {
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		EmployeeSortbyName emp =  new EmployeeSortbyName(1, "smit", "HR", 60000);
		EmployeeSortbyName emp1 = new EmployeeSortbyName(2, "rahul", "HR", 700000);
		EmployeeSortbyName emp2 = new EmployeeSortbyName(3, "abhinash", "HR", 200);
		EmployeeSortbyName emp3 = new EmployeeSortbyName(4, "pankaj", "FIN", 20);
		EmployeeSortbyName emp4 = new EmployeeSortbyName(5, "mukesh", "IT", 80000);
		
		List<EmployeeSortbyName> list = new ArrayList();
		
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		System.out.println("befor sorting");
		list.stream().forEach(System.out::println);
		// System.out.println(list);
		Collections.sort(list);
		System.out.println("After Sorting");
		// System.out.println(list);
		list.stream().forEach(System.out::println);
	}

	
	@Override
	public int compareTo(EmployeeSortbyName o) {
		return this.name.compareTo(o.name);
	}
}
