package com.javaeight.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxSalaryFinding {
    int id;
    String name;
    String dep;
    int salary;

    public MaxSalaryFinding(int id, String name, String dep, int salary) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MaxSalaryFinding{" + "id=" + id + ", name='" + name + '\'' + ", dep='" + dep + '\'' + ", salary=" + salary + '}';
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {

        MaxSalaryFinding emp = new MaxSalaryFinding(1, "smit", "HR", 60000);
        MaxSalaryFinding emp1 = new MaxSalaryFinding(2, "rahul", "HR", 70000);
        MaxSalaryFinding emp2 = new MaxSalaryFinding(3, "abhinash", "HR", 200);
        MaxSalaryFinding emp3 = new MaxSalaryFinding(4, "pankaj", "FIN", 20);
        MaxSalaryFinding emp4 = new MaxSalaryFinding(5, "mukesh", "IT", 80000);

        List<MaxSalaryFinding> list = new ArrayList();
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);

         System.out.println(list.stream().max((e1, e2) -> (e1.getSalary() - e2.getSalary())).get().getSalary());
        System.out.println(list.stream().max(Comparator.comparingInt(es -> es.getSalary())).get().getSalary());
    }
}
