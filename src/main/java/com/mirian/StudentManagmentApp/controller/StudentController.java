package com.mirian.StudentManagmentApp.controller;

import com.mirian.StudentManagmentApp.model.Student;
import com.mirian.StudentManagmentApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String listAllStudents(Model model) {
        model.addAttribute("students", studentService.findAllStudents());
        return "students";
    }

    @GetMapping("/addStudent")
    public String getStudentCreationForm(Model model, Student student) {
        model.addAttribute("student", student);
        return "addStudent";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students/list";
    }

    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("studentId") int studentId, Model theModel) {gi
        Student theStudent = studentService.findStudentById(studentId);
        theModel.addAttribute("student", theStudent);
        return "addStudent";

    }
    // Not good approach
    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("studentId") int studentId) {
        studentService.deleteStudentById(studentId);
        return "redirect:/students/list";
    }
}
