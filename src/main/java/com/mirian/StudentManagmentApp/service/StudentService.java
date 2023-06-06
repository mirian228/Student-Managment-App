package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();

    Student findStudentById();

    Student saveStudent();

    Student updateStudent();

    void deletePrincipal();
}
