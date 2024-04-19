package com.javaeight.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//sorted on the basis of Name then salary after getting salary more than 50000.
public class EmployeeSorting {
	int id;
	String name;
	String dep;
	int salary;

	public EmployeeSorting(int id, String name, String dep, int salary) {
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}

	public static void main(String[] args) {
		EmployeeSorting emp = new EmployeeSorting(1, "smit", "HR", 60000);
		EmployeeSorting emp1 = new EmployeeSorting(2, "rahul", "HR", 70000);
		EmployeeSorting emp2 = new EmployeeSorting(3, "abhinash", "HR", 200);
		EmployeeSorting emp3 = new EmployeeSorting(4, "pankaj", "FIN", 20);
		EmployeeSorting emp4 = new EmployeeSorting(5, "mukesh", "IT", 80000);

		List<EmployeeSorting> list = new ArrayList();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		// sorted on the basis of Name then salary after getting salary more than 50000.
		System.out.println("name sorting");
		list.stream().sorted((emp5, emp6) -> (emp5.getName().compareTo(emp6.getName()))).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("salary sorting aftr 50000");

//sorted on the basis of Name then salary after getting salary more than 50000
		list.stream().filter(e -> e.getSalary() > 50000)
		        .sorted((es1, es2) -> (es1.getName().compareTo(es2.getName())))
				.sorted((es3, es4) -> (es3.getSalary() - es4.getSalary()))
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}

	// sorted on the basis of salary after getting salary more than 50000

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", dep='" + dep + '\'' + ", salary=" + salary
				+ '}';
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

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getSalary() {
		return salary;
	}

	/* >50000 and sort the name alphabetically and collect in list */

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
