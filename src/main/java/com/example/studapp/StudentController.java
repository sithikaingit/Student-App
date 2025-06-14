package com.example.studapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    StudentApp studentApp = new StudentApp();

    @GetMapping("/student/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "home";
    }

    @PostMapping("/student/save")
    public String saveStudent(@ModelAttribute Student student, Model model) {
        studentApp.addStudent(student);
        model.addAttribute("students", studentApp.getAllStudents());
        return "list"; // Will create list.html later if needed
    }
}