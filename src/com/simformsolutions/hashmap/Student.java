package com.simformsolutions.hashmap;
import java.util.HashMap;
import java.util.Map;

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
        HashMap<Integer, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(101, new Student("parth", "CompilerDesign", 60));
        studentHashMap.put(201, new Student("Arpit", "CompilerDesign", 99));
        studentHashMap.put(102, new Student("yash", "CompilerDesign", 10));
        studentHashMap.put(301, new Student("sailesh", "CompilerDesign", 1));

        System.out.println(studentHashMap);
//        System.out.println(studentHashMap.entrySet());
        for (Map.Entry s :
                studentHashMap.entrySet()) {
            System.out.println(s);
        }
    }
}
