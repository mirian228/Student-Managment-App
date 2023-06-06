package com.mirian.StudentManagmentApp.service;

import com.mirian.StudentManagmentApp.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAllTeachers();

    Teacher findTeacherById();

    Teacher saveTeacher();

    Teacher updateTeacher();

    void deleteTeacher();
}
