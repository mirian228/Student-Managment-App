package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();

    Student findStudentById(int studentId);

    Student saveStudent(Student student);

    Student updateStudentById(int studentId, Student student);

    void deleteStudentById(int studentId);
}
