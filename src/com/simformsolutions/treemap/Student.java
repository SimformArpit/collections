package com.simformsolutions.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Student {
    String subject;
    int mark;
    String name;

    Student(String name, String subject, int mark) {
        this.name = name;
        this.subject = subject;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject='" + subject + '\'' +
                ", mark=" + mark +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>();
        studentTreeMap.put(101, new Student("parth", "CompilerDesign", 60));
        studentTreeMap.put(201, new Student("Arpit", "CompilerDesign", 99));
        studentTreeMap.put(102, new Student("yash", "CompilerDesign", 10));
        studentTreeMap.put(301, new Student("sailesh", "CompilerDesign", 1));
        for (Map.Entry s :
                studentTreeMap.entrySet()) {
            System.out.println(s);
        }
    }
}
