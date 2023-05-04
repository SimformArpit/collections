package com.simformsolutions.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Employee {
    String employeeName;
    int employeeId;
    String stack;

    Employee(String name, int id, String stack) {
        this.employeeName = name;
        this.employeeId = id;
        this.stack = stack;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", stack='" + stack + '\'' +
                '}';
    }


    public static void main(String[] args) {

        ArrayList<Employee> employeeArrayList = new ArrayList();
        employeeArrayList.add(new Employee("Arpit", 101, "Java"));
        employeeArrayList.add(new Employee("Parth", 102, "Python"));
        employeeArrayList.add(new Employee("Sailesh", 103, "QA"));
        employeeArrayList.add(new Employee("Yash", 104, "PHP"));

        System.out.println(employeeArrayList);
        ListIterator<Employee> employeeListIterator = employeeArrayList.listIterator();
        while (employeeListIterator.hasNext()) {
            System.out.println(employeeListIterator.next());
        }


    }
}
