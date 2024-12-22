package com.javaeight.lamda;

//Write a program to sort the elements in collections?
//public class Employee {int id; int age; double salary; String name;
//}
//use above the Employee class and sort the Employee objects in descending order based on name and salary.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesortsNameSalary {

    int id;
    int age;
    double salary;
    String name;



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public double getSalary() {
        return salary;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }



    public String getName() {
        return name;
    }



    public EmployeesortsNameSalary(int id, int age, double salary, String name) {
        super();
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.name = name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public static void main(String[] args) {

        EmployeesortsNameSalary emp1=new EmployeesortsNameSalary(1,26,10000.0,"Ram");
        EmployeesortsNameSalary emp2=new EmployeesortsNameSalary(1,26,20000.0,"Girish");
        EmployeesortsNameSalary emp3=new EmployeesortsNameSalary(1,26,80000.0,"Amit");
        EmployeesortsNameSalary emp4=new EmployeesortsNameSalary(1,26,500000.0,"Viraj");

        List<EmployeesortsNameSalary> EmployeesortsNameSalarylist=new ArrayList<>();

        EmployeesortsNameSalarylist.add(emp1);
        EmployeesortsNameSalarylist.add(emp2);
        EmployeesortsNameSalarylist.add(emp3);
        EmployeesortsNameSalarylist.add(emp4);

        List<EmployeesortsNameSalary> EmployeesortsNameSalarylist2	=EmployeesortsNameSalarylist.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).
                sorted(Comparator.comparingDouble(EmployeesortsNameSalary::getSalary).reversed()).
                collect(Collectors.toList());



        System.out.println(EmployeesortsNameSalarylist2);

    }



    @Override
    public String toString() {
        return "EmployeesortsNameSalary [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + "]";
    }

}
