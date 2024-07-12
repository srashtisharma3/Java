package com.company;

class Employee{
    int id;
    String name;
    int salary;

    // create function
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is first custom class!!");
        Employee emp = new Employee(); // instantiating a new emp obj
        Employee emp2 = new Employee();

        // setting attributes
        emp.id = 101;
        emp.salary = 50000;
        emp.name = "Srashti";
        emp2.id = 102;
        emp2.salary = 450000;
        emp2.name = "Kinnu";

        // printing the attributes
        // call function
        emp.printDetails();
        emp.getSalary();
        emp2.printDetails();
        int salary = emp2.getSalary();
        System.out.println("and my salary is " + salary);

//        System.out.println(emp.id);
//        System.out.println(emp.name);
    }
}
