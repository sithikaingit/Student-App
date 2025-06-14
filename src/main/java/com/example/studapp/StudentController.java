package com.example.studapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    StudentApp studentApp = new StudentApp();

    // Show the form
    @GetMapping("/student/add")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "home";
    }

    // Save the form submission
    @PostMapping("/student/save")
    public String saveStudent(@ModelAttribute Student student, Model model) {
        studentApp.addStudent(student);
        model.addAttribute("students", studentApp.getAllStudents());
        return "list";
    }

    // ✅ ADD THIS: View all students when clicking the link
    @GetMapping("/students")
    public String viewAllStudents(Model model) {
        model.addAttribute("students", studentApp.getAllStudents());
        return "list"; // make sure you have list.html in templates
    }
}