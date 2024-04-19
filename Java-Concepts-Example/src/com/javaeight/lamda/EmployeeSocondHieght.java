package com.javaeight.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSocondHieght {
    int id;
    String name;
    double salary;

    public EmployeeSocondHieght(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public EmployeeSocondHieght() {

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
        EmployeeSocondHieght emp1 = new EmployeeSocondHieght(1, "amit", 10000);
        EmployeeSocondHieght emp2 = new EmployeeSocondHieght(2, "rahul", 15000);
        EmployeeSocondHieght emp3 = new EmployeeSocondHieght(2, "rahul", 20000);

        ArrayList<EmployeeSocondHieght> al = new ArrayList<>();
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);

        List<EmployeeSocondHieght> list = al.stream().
                sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).
                skip(1).
                collect(Collectors.toList());

        System.out.println(list.get(0).salary);


    }


}
