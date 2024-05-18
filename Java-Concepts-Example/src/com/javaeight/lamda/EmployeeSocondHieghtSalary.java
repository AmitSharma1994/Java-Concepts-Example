package com.javaeight.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSocondHieghtSalary {
    int id;
    String name;
    double salary;

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
        EmployeeSocondHieghtSalary emp1 = new EmployeeSocondHieghtSalary(1, "amit", 10000);
        EmployeeSocondHieghtSalary emp2 = new EmployeeSocondHieghtSalary(2, "rahul", 15000);
        EmployeeSocondHieghtSalary emp3 = new EmployeeSocondHieghtSalary(2, "rahul", 20000);

        ArrayList<EmployeeSocondHieghtSalary> al = new ArrayList<>();
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);

        List<EmployeeSocondHieghtSalary> list = al.stream().
                sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).
                skip(1).
                collect(Collectors.toList());

        System.out.println(list.get(0).getSalary());


    }


}
