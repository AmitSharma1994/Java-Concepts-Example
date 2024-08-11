package com.comprator;

import java.util.*;

public class EmployeeSortBydeparmentthenid {
    private String name;
    private String department;
    private int id;

    // Constructor
    public EmployeeSortBydeparmentthenid(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', id=" + id + '}';
    }

    public static void main(String[] args) {
        List<EmployeeSortBydeparmentthenid> employees = new ArrayList<>(Arrays.asList(
            new EmployeeSortBydeparmentthenid("Alice", "HR", 5),
            new EmployeeSortBydeparmentthenid("Bob", "IT", 3),
            new EmployeeSortBydeparmentthenid("Charlie", "IT", 1),
            new EmployeeSortBydeparmentthenid("Dave", "HR", 2),
            new EmployeeSortBydeparmentthenid("Eve", "Sales", 4)
        ));

        // Sorting the list of employees by their deparment and then id.
        employees.sort(Comparator
                .comparing(EmployeeSortBydeparmentthenid::getDepartment)
                .thenComparing(EmployeeSortBydeparmentthenid::getId));

        // Printing the sorted list
        employees.forEach(System.out::println);
    }
}
