package com.simformsolutions.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Student {
    long enrollmentNo;
    String name;
    String Department;

    Student(long enrollmentNo, String name, String department) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.Department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentNo=" + enrollmentNo +
                ", name='" + name + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }

    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student(190630107089L, "Arpit", "Computer"));
        studentHashSet.add(new Student(190630107088L, "Parth", "IT"));
        studentHashSet.add(new Student(190630107087L, "Yash", "Computer"));
        studentHashSet.add(new Student(190630107086L, "Hardeek", "IT"));

        Iterator studentIterator = studentHashSet.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
        int a =10 ;
        System.out.println(a++ + a++ + ++a);
    }
}
