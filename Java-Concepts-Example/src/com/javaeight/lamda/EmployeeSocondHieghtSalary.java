package com.javaeight.lamda;

import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeSocondHieghtSalary {
	int id;
	String name;
	double salary;

	Stream str;
	SequenceInputStream sr1;
	private static int sum1;

	public EmployeeSocondHieghtSalary(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeeSocondHieghtSalary() {

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		EmployeeSocondHieghtSalary emp1 = new EmployeeSocondHieghtSalary(1, "amit", 100000);
		EmployeeSocondHieghtSalary emp2 = new EmployeeSocondHieghtSalary(2, "rahul", 15000);
		EmployeeSocondHieghtSalary emp3 = new EmployeeSocondHieghtSalary(2, "amitsha", 20000);
		EmployeeSocondHieghtSalary emp4 = new EmployeeSocondHieghtSalary(2, "kumar", 25000);
		EmployeeSocondHieghtSalary emp5 = new EmployeeSocondHieghtSalary(2, "sharma", 30000);
		EmployeeSocondHieghtSalary emp6 = new EmployeeSocondHieghtSalary(2, "rahul", 40000);

		ArrayList<EmployeeSocondHieghtSalary> al = new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		al.add(emp6);

		List<EmployeeSocondHieghtSalary> list = al.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
				.skip(1).collect(Collectors.toList());

		System.out.println("listchecking"+list);
		
		
		Optional<EmployeeSocondHieghtSalary> em = al.stream()
				.sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary())).skip(1).findFirst();

		System.out.println("findfirst>>>" + em.get().getSalary());

		// Optional<List<EmployeeSocondHieghtSalary>> empop=Optional.of(list);

		// if(empop.isPresent()) {

		// EmployeeSocondHieghtSalary em= (EmployeeSocondHieghtSalary) empop.get();
		// }

		System.out.println(list.get(0).getSalary());

	}

}
