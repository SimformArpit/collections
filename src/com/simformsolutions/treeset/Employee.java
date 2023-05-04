package com.simformsolutions.treeset;

import com.simformsolutions.hashmap.Student;

import java.util.Iterator;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
    String employeeName;
    int employeeId;
    String stack;

    Employee(String name, int id, String stack) {
        this.employeeName = name;
        this.employeeId = id;
        this.stack = stack;
    }
    @Override
    public int compareTo(Employee o) {
        if(this.employeeId>o.employeeId){
            return 1;
        } else if (this.employeeId<o.employeeId) {
            return -1;
        }
        else{
            return 0;
        }
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
        TreeSet<Employee> studentTreeset = new TreeSet<>();
        studentTreeset.add(new Employee("Arpit", 101, "Java"));
        studentTreeset.add(new Employee("Parth", 104, "Python"));
        studentTreeset.add(new Employee("Sailesh", 105, "QA"));
        studentTreeset.add(new Employee("Yash", 100, "PHP"));
//        for (Employee e:
//                studentTreeset) {
//            System.out.println(e);
//        }
        Iterator<Employee> itr = studentTreeset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
