package com.javaeight.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeGropingBy {

	private int id;
	private String name;
	private String dep;
	private int salary;

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

	public EmployeeGropingBy(int id, String name, String dep, int salary) {
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.salary = salary;
	}

	public static void main(String[] args) {
		EmployeeGropingBy emp = new EmployeeGropingBy(1, "smit", "HR", 60000);
		EmployeeGropingBy emp1 = new EmployeeGropingBy(2, "rahul", "HR", 70000);
		EmployeeGropingBy emp2 = new EmployeeGropingBy(3, "abhinash", "HR", 200);
		EmployeeGropingBy emp3 = new EmployeeGropingBy(4, "pankaj", "FIN", 20);
		EmployeeGropingBy emp4 = new EmployeeGropingBy(5, "mukesh", "IT", 80000);

		List<EmployeeGropingBy> list = new ArrayList();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		// find the count of employee to each departement.
		System.out.println("find the count of employee to each departement.");
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(EmployeeGropingBy::getDep, Collectors.counting()));

		map.forEach((depart, count) -> {
			System.out.println(depart + " " + count);
		});
		
		
		
	Map<String, List<EmployeeGropingBy>>  map1=	list.stream()
		.collect(Collectors.groupingBy(EmployeeGropingBy::getDep, Collectors.toList()));
	
	
	System.out.println("list of employee");
	
	//map1.forEach((depart,employeelist)->{
		//System.out.println(depart +" "+employeelist.forEach(e->e.id));
	//});
	
		
		
		

		//map.forEach((depart, count) -> System.out.println(depart + " " + count));

		// find employee with departmentwise having highest salary
		System.out.println("find employee with departmentwise having highest  salary");
		Map<String, Optional<EmployeeGropingBy>> list3 = list.stream().collect(Collectors.groupingBy(
				EmployeeGropingBy::getDep, Collectors.maxBy(Comparator.comparingDouble(EmployeeGropingBy::getSalary))));

		list3.forEach((dept, Emp) -> System.out.println(dept + " " + emp.getSalary()));

		// find employee with departmentwise sortwithname

		// list.stream().collect(Collectors.groupingBy(
		// EmployeeGropingBy::getDep,Collectors.collectingAndThen(Optional::ofNullable,Optional::ofNullable)));

	}
}
