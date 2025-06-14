package com.example.studapp;

import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public List<Student> getAllStudents() {
        return studentList;
    }
}